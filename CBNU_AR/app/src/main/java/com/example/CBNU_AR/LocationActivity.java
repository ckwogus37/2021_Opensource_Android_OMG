
package com.example.CBNU_AR;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.UnavailableException;
import com.google.ar.sceneform.ArSceneView;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.ViewRenderable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import uk.co.appoly.arcorelocation.LocationMarker;
import uk.co.appoly.arcorelocation.LocationScene;
import uk.co.appoly.arcorelocation.rendering.LocationNode;
import uk.co.appoly.arcorelocation.rendering.LocationNodeRender;
import uk.co.appoly.arcorelocation.utils.ARLocationPermissionHelper;

public class LocationActivity extends AppCompatActivity {
    private int Maxdistance = 300;
    private int distance1 = 1000;
    private int distance2 = 1000;
    private boolean installRequested;

    //랜더링 될 준비가 되었는지 확인
    private boolean hasFinishedLoading = false;
    private boolean hasFinishedLoading2 = false;
    
    private Snackbar loadingMessageSnackbar = null;

    //AR-Scene 오픈소스 활용
    private ArSceneView arSceneView;

    // 랜더링을 위한 변수들 선언
    private ModelRenderable andyRenderable;
    private ModelRenderable andyRenderable2;
    private ViewRenderable exampleLayoutRenderable;
    private ViewRenderable exampleLayoutRenderable2;

    // AR-Location 오픈소스 활용
    private LocationScene locationScene;


    @Override
    @SuppressWarnings({"AndroidApiChecker", "FutureReturnValueIgnored"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sceneform);
        arSceneView = findViewById(R.id.ar_scene_view);


        // 렌더링 될 레이아웃들 선언
        CompletableFuture<ViewRenderable> exampleLayout =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout2 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout2)
                        .build();



        //각 레이아웃들을 렌더링시키기
        CompletableFuture.allOf(
                exampleLayout)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable = exampleLayout.get();
                                hasFinishedLoading = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout2)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable2 = exampleLayout2.get();
                                hasFinishedLoading2 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        // Google AR-Scene을 사용하여 화면에 렌더링 된 이미지 투척
        arSceneView
                .getScene()
                .setOnUpdateListener(
                        frameTime -> {
                            if (!hasFinishedLoading) {
                                return;
                            }

                            if (locationScene == null) {
                                locationScene = new LocationScene(this, this, arSceneView);

                                //레이아웃들의 위도와 경도를 통해 위치 지정
                                LocationMarker layoutLocationMarker = new LocationMarker(
                                        127.08051,
                                        37.31304,
                                        getExampleView(exampleLayoutRenderable)
                                );
                                LocationMarker layoutLocationMarker2 = new LocationMarker(
                                        127.07206,
                                        37.31625,
                                        getExampleView(exampleLayoutRenderable2)
                                );


                                //렌더링 될 때마다 다음의 함수 실행
                                layoutLocationMarker.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance1 = node.getDistance();
                                        if(distance1 < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable.getView();
                                            TextView textView = eView.findViewById(R.id.textView);
                                            textView.setText("성복역");
                                            TextView distanceTextView = eView.findViewById(R.id.textView2);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable.getView();
                                            TextView textView = eView.findViewById(R.id.textView);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView2);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker2.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance2 = node.getDistance();
                                        if(distance2 < Maxdistance) {
                                            View eView2 = exampleLayoutRenderable2.getView();
                                            TextView textView = eView2.findViewById(R.id.textView3);
                                            textView.setText("마트");
                                            TextView distanceTextView2 = eView2.findViewById(R.id.textView4);
                                            distanceTextView2.setText(node.getDistance() + "M");
                                            eView2.setBackgroundColor(Color.RED);
                                        }
                                        else {
                                            View eView2 = exampleLayoutRenderable2.getView();
                                            TextView textView = eView2.findViewById(R.id.textView3);
                                            textView.setText("");
                                            TextView distanceTextView = eView2.findViewById(R.id.textView4);
                                            distanceTextView.setText("");
                                            eView2.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                // locationScene.mLocationMarkers에 넣음으로 렌더링 될 대상에 포함시킴
                                locationScene.mLocationMarkers.add(layoutLocationMarker);
                                locationScene.mLocationMarkers.add(layoutLocationMarker2);
                            }

                            Frame frame = arSceneView.getArFrame();
                            if (frame == null) {
                                return;
                            }

                            if (frame.getCamera().getTrackingState() != TrackingState.TRACKING) {
                                return;
                            }

                            if (locationScene != null) {
                                locationScene.processFrame(frame);
                            }

                            if (loadingMessageSnackbar != null) {
                                for (Plane plane : frame.getUpdatedTrackables(Plane.class)) {
                                    if (plane.getTrackingState() == TrackingState.TRACKING) {
                                        hideLoadingMessage();
                                    }
                                }
                            }
                        });



        // 카메라와 현재 위치에 대한 권한이 있는지에 대한 확인
        ARLocationPermissionHelper.requestPermission(this);
    }


    //폐기된 부분
    private Node getExampleView(ViewRenderable thing) {
        Node base = new Node();
        base.setRenderable(thing);
        Context c = this;
//        View eView = thing.getView();
        // 렌더링된 이미지 터치시 실행하려 했으나 해당 부분 삭제
//        eView.setOnTouchListener((v, event) -> {
//            Toast.makeText(
//                    c, "터치", Toast.LENGTH_LONG)
//                    .show();
//            return false;
//        });
        return base;
    }

    //LocationScene을 활용하기 위한 부분.
    //오픈소스 ARLocation 참고 https://github.com/appoly/ARCore-Location
    //오픈소스 ARScene 참고 https://github.com/google-ar/sceneform-android-sdk
    @Override
    protected void onResume() {
        super.onResume();

        if (locationScene != null) {
            locationScene.resume();
        }

        if (arSceneView.getSession() == null) {
            try {
                Session session = DemoUtils.createArSession(this, installRequested);
                if (session == null) {
                    installRequested = ARLocationPermissionHelper.hasPermission(this);
                    return;
                } else {
                    arSceneView.setupSession(session);
                }
            } catch (UnavailableException e) {
                DemoUtils.handleSessionException(this, e);
            }
        }

        try {
            arSceneView.resume();
        } catch (CameraNotAvailableException ex) {
            DemoUtils.displayError(this, "Unable to get camera", ex);
            finish();
            return;
        }

        if (arSceneView.getSession() != null) {
            showLoadingMessage();
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (locationScene != null) {
            locationScene.pause();
        }

        arSceneView.pause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        arSceneView.destroy();
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[] permissions, @NonNull int[] results) {
        if (!ARLocationPermissionHelper.hasPermission(this)) {
            if (!ARLocationPermissionHelper.shouldShowRequestPermissionRationale(this)) {
                ARLocationPermissionHelper.launchPermissionSettings(this);
            } else {
                Toast.makeText(
                        this, "Camera permission is needed to run this application", Toast.LENGTH_LONG)
                        .show();
            }
            finish();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
    }

    private void showLoadingMessage() {
        if (loadingMessageSnackbar != null && loadingMessageSnackbar.isShownOrQueued()) {
            return;
        }

        loadingMessageSnackbar =
                Snackbar.make(
                        LocationActivity.this.findViewById(android.R.id.content),
                        R.string.plane_finding,
                        Snackbar.LENGTH_INDEFINITE);
        loadingMessageSnackbar.getView().setBackgroundColor(0xbf323232);
        loadingMessageSnackbar.show();
    }

    private void hideLoadingMessage() {
        if (loadingMessageSnackbar == null) {
            return;
        }

        loadingMessageSnackbar.dismiss();
        loadingMessageSnackbar = null;
    }
}
