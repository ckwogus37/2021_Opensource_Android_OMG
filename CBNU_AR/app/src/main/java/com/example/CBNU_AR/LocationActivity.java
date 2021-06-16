
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
    private int Maxdistance = 150;
    private int distance = 1000;
    private boolean installRequested;

    //랜더링 될 준비가 되었는지 확인
    private boolean hasFinishedLoading = false;
    private boolean hasFinishedLoading2 = false;
    private boolean hasFinishedLoading3 = false;
    private boolean hasFinishedLoading4 = false;
    private boolean hasFinishedLoading5 = false;
    private boolean hasFinishedLoading6 = false;
    private boolean hasFinishedLoading7 = false;
    private boolean hasFinishedLoading8 = false;
    private boolean hasFinishedLoading9 = false;
    private boolean hasFinishedLoading10 = false;
    private boolean hasFinishedLoading11 = false;
    private boolean hasFinishedLoading12 = false;
    private boolean hasFinishedLoading13 = false;
    private boolean hasFinishedLoading14 = false;
    private boolean hasFinishedLoading15 = false;
    private boolean hasFinishedLoading16 = false;
    private boolean hasFinishedLoading17 = false;
    private boolean hasFinishedLoading18 = false;
    private boolean hasFinishedLoading19 = false;
    private boolean hasFinishedLoading20 = false;
    private boolean hasFinishedLoading21 = false;
    private boolean hasFinishedLoading22 = false;
    private boolean hasFinishedLoading23 = false;
    private boolean hasFinishedLoading24 = false;
    private boolean hasFinishedLoading25 = false;
    private boolean hasFinishedLoading26 = false;
    private boolean hasFinishedLoading27 = false;
    private boolean hasFinishedLoading28 = false;
    private boolean hasFinishedLoading29 = false;
    private boolean hasFinishedLoading30 = false;
    private boolean hasFinishedLoading31 = false;
    private boolean hasFinishedLoading32 = false;
    private boolean hasFinishedLoading33 = false;
    
    private Snackbar loadingMessageSnackbar = null;

    //AR-Scene 오픈소스 활용
    private ArSceneView arSceneView;

    // 랜더링을 위한 변수들 선언
    private ViewRenderable exampleLayoutRenderable;
    private ViewRenderable exampleLayoutRenderable2;
    private ViewRenderable exampleLayoutRenderable3;
    private ViewRenderable exampleLayoutRenderable4;
    private ViewRenderable exampleLayoutRenderable5;
    private ViewRenderable exampleLayoutRenderable6;
    private ViewRenderable exampleLayoutRenderable7;
    private ViewRenderable exampleLayoutRenderable8;
    private ViewRenderable exampleLayoutRenderable9;
    private ViewRenderable exampleLayoutRenderable10;
    private ViewRenderable exampleLayoutRenderable11;
    private ViewRenderable exampleLayoutRenderable12;
    private ViewRenderable exampleLayoutRenderable13;
    private ViewRenderable exampleLayoutRenderable14;
    private ViewRenderable exampleLayoutRenderable15;
    private ViewRenderable exampleLayoutRenderable16;
    private ViewRenderable exampleLayoutRenderable17;
    private ViewRenderable exampleLayoutRenderable18;
    private ViewRenderable exampleLayoutRenderable19;
    private ViewRenderable exampleLayoutRenderable20;
    private ViewRenderable exampleLayoutRenderable21;
    private ViewRenderable exampleLayoutRenderable22;
    private ViewRenderable exampleLayoutRenderable23;
    private ViewRenderable exampleLayoutRenderable24;
    private ViewRenderable exampleLayoutRenderable25;
    private ViewRenderable exampleLayoutRenderable26;
    private ViewRenderable exampleLayoutRenderable27;
    private ViewRenderable exampleLayoutRenderable28;
    private ViewRenderable exampleLayoutRenderable29;
    private ViewRenderable exampleLayoutRenderable30;
    private ViewRenderable exampleLayoutRenderable31;
    private ViewRenderable exampleLayoutRenderable32;
    private ViewRenderable exampleLayoutRenderable33;

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

        CompletableFuture<ViewRenderable> exampleLayout3 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout3)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout4 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout4)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout5 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout5)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout6 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout6)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout7 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout7)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout8 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout8)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout9 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout9)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout10 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout10)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout11 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout11)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout12 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout12)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout13 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout13)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout14 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout14)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout15 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout15)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout16 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout16)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout17 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout17)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout18 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout18)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout19 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout19)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout20 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout20)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout21 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout21)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout22 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout22)
                        .build();
        CompletableFuture<ViewRenderable> exampleLayout23 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout23)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout24 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout24)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout25 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout25)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout26 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout26)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout27 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout27)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout28 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout28)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout29 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout29)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout30 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout30)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout31 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout31)
                        .build();

        CompletableFuture<ViewRenderable> exampleLayout32 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout32)
                        .build();
        CompletableFuture<ViewRenderable> exampleLayout33 =
                ViewRenderable.builder()
                        .setView(this, R.layout.example_layout33)
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

        CompletableFuture.allOf(
                exampleLayout3)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable3 = exampleLayout3.get();
                                hasFinishedLoading3 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout4)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable4 = exampleLayout4.get();
                                hasFinishedLoading4 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout5)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable5 = exampleLayout5.get();
                                hasFinishedLoading5 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout6)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable6 = exampleLayout6.get();
                                hasFinishedLoading6 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout7)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable7 = exampleLayout7.get();
                                hasFinishedLoading7 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout8)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable8 = exampleLayout8.get();
                                hasFinishedLoading8 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout9)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable9 = exampleLayout9.get();
                                hasFinishedLoading9 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout10)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable10 = exampleLayout10.get();
                                hasFinishedLoading10 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout11)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable11 = exampleLayout11.get();
                                hasFinishedLoading11 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout12)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable12 = exampleLayout12.get();
                                hasFinishedLoading12 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout13)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable13 = exampleLayout13.get();
                                hasFinishedLoading13 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout14)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable14 = exampleLayout14.get();
                                hasFinishedLoading14 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout15)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable15 = exampleLayout15.get();
                                hasFinishedLoading15 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout16)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable16 = exampleLayout16.get();
                                hasFinishedLoading16 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout17)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable17 = exampleLayout17.get();
                                hasFinishedLoading17 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout18)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable18 = exampleLayout18.get();
                                hasFinishedLoading18 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout19)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable19 = exampleLayout19.get();
                                hasFinishedLoading19 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout20)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable20 = exampleLayout20.get();
                                hasFinishedLoading20 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout21)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable21 = exampleLayout21.get();
                                hasFinishedLoading21 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout22)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable22 = exampleLayout22.get();
                                hasFinishedLoading22 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout23)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable23 = exampleLayout23.get();
                                hasFinishedLoading23 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout24)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable24 = exampleLayout24.get();
                                hasFinishedLoading24 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout25)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable25 = exampleLayout25.get();
                                hasFinishedLoading25 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout26)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable26 = exampleLayout26.get();
                                hasFinishedLoading26 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout27)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable27 = exampleLayout27.get();
                                hasFinishedLoading27 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout28)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable28 = exampleLayout28.get();
                                hasFinishedLoading28 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout29)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable29 = exampleLayout29.get();
                                hasFinishedLoading29 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout30)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable30 = exampleLayout30.get();
                                hasFinishedLoading30 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout31)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable31 = exampleLayout31.get();
                                hasFinishedLoading31 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout32)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable32 = exampleLayout32.get();
                                hasFinishedLoading32 = true;
                            } catch (InterruptedException | ExecutionException ex) {
                                DemoUtils.displayError(this, "Unable to load renderables", ex);
                            }
                            return null;
                        });

        CompletableFuture.allOf(
                exampleLayout33)
                .handle(
                        (notUsed, throwable) -> {
                            if (throwable != null) {
                                DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                return null;
                            }
                            try {
                                exampleLayoutRenderable33 = exampleLayout33.get();
                                hasFinishedLoading33 = true;
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
                                LocationMarker layoutLocationMarker = new LocationMarker( //법학전문대학원
                                        127.45400,
                                        36.63193,
                                        getExampleView(exampleLayoutRenderable)
                                );
                                LocationMarker layoutLocationMarker2 = new LocationMarker( //대학본부
                                        127.45475,
                                        36.63014,
                                        getExampleView(exampleLayoutRenderable2)
                                );
                                LocationMarker layoutLocationMarker3 = new LocationMarker( //공동실험실습관
                                        127.45526,
                                        36.62930,
                                        getExampleView(exampleLayoutRenderable3)
                                );
                                LocationMarker layoutLocationMarker4 = new LocationMarker( // 중앙도서관
                                        127.45741,
                                        36.62845,
                                        getExampleView(exampleLayoutRenderable4)
                                );
                                LocationMarker layoutLocationMarker5 = new LocationMarker( // 경영학관
                                        127.45692,
                                        36.63005,
                                        getExampleView(exampleLayoutRenderable5)
                                );
                                LocationMarker layoutLocationMarker6 = new LocationMarker( //인문사회관 강의동
                                        127.45646,
                                        36.63093,
                                        getExampleView(exampleLayoutRenderable6)
                                );
                                LocationMarker layoutLocationMarker7 = new LocationMarker( //사회과학대학
                                        127.45783,
                                        36.62937,
                                        getExampleView(exampleLayoutRenderable7)
                                );
                                LocationMarker layoutLocationMarker8 = new LocationMarker( //미술관
                                        127.45727,
                                        36.63078,
                                        getExampleView(exampleLayoutRenderable8)
                                );
                                LocationMarker layoutLocationMarker9 = new LocationMarker( //개성제
                                        127.45803,
                                        36.63145,
                                        getExampleView(exampleLayoutRenderable9)
                                );
                                LocationMarker layoutLocationMarker10 = new LocationMarker( // 생활과학대학
                                        127.46088,
                                        36.63040,
                                        getExampleView(exampleLayoutRenderable10)
                                );
                                LocationMarker layoutLocationMarker11 = new LocationMarker( //사범대 강의동
                                        127.46060,
                                        36.62875,
                                        getExampleView(exampleLayoutRenderable11)
                                );
                                LocationMarker layoutLocationMarker12 = new LocationMarker( //개신문화관
                                        127.45946,
                                        36.62817,
                                        getExampleView(exampleLayoutRenderable12)
                                );
                                LocationMarker layoutLocationMarker13 = new LocationMarker( //제1학생회관
                                        127.45881,
                                        36.62754,
                                        getExampleView(exampleLayoutRenderable13)
                                );
                                LocationMarker layoutLocationMarker14 = new LocationMarker( //의과대학1호관
                                        127.46081,
                                        36.62483,
                                        getExampleView(exampleLayoutRenderable14)
                                );
                                LocationMarker layoutLocationMarker15 = new LocationMarker( //공과대학본관
                                        127.45813,
                                        36.62659,
                                        getExampleView(exampleLayoutRenderable15)
                                );
                                LocationMarker layoutLocationMarker16 = new LocationMarker( //전자정보1관
                                        127.45795,
                                        36.62546,
                                        getExampleView(exampleLayoutRenderable16)
                                );
                                LocationMarker layoutLocationMarker17 = new LocationMarker( //제5공학관
                                        127.45804,
                                        36.62409,
                                        getExampleView(exampleLayoutRenderable17)
                                );
                                LocationMarker layoutLocationMarker18 = new LocationMarker( //양진재
                                        127.45938,
                                        36.62395,
                                        getExampleView(exampleLayoutRenderable18)
                                );
                                LocationMarker layoutLocationMarker19 = new LocationMarker( //학연산
                                        127.45719,
                                        36.62508,
                                        getExampleView(exampleLayoutRenderable19)
                                );
                                LocationMarker layoutLocationMarker20 = new LocationMarker( //전자정보2관
                                        127.45784,
                                        36.62489,
                                        getExampleView(exampleLayoutRenderable20)
                                );
                                LocationMarker layoutLocationMarker21 = new LocationMarker( //수의대학 및 동물병원
                                        127.45604,
                                        36.62329,
                                        getExampleView(exampleLayoutRenderable21)
                                );
                                LocationMarker layoutLocationMarker22 = new LocationMarker( // 자연대 1호관
                                        127.45673,
                                        36.62775,
                                        getExampleView(exampleLayoutRenderable22)
                                );

                                LocationMarker layoutLocationMarker23 = new LocationMarker( //자연대 3호관
                                        127.45679,
                                        36.62668,
                                        getExampleView(exampleLayoutRenderable23)
                                );
                                LocationMarker layoutLocationMarker24 = new LocationMarker( //자연대 6호관
                                        127.45590,
                                        36.62504,
                                        getExampleView(exampleLayoutRenderable24)
                                );
                                LocationMarker layoutLocationMarker25 = new LocationMarker( //과기도
                                        127.45705,
                                        36.62692,
                                        getExampleView(exampleLayoutRenderable25)
                                );
                                LocationMarker layoutLocationMarker26 = new LocationMarker( // 전산정보원
                                        127.45547,
                                        36.62638,
                                        getExampleView(exampleLayoutRenderable26)
                                );
                                LocationMarker layoutLocationMarker27 = new LocationMarker( //전자정보3관
                                        127.45440,
                                        36.62557,
                                        getExampleView(exampleLayoutRenderable27)
                                );
                                LocationMarker layoutLocationMarker28 = new LocationMarker( //나이팅게일관
                                        127.45483,
                                        36.62520,
                                        getExampleView(exampleLayoutRenderable28)
                                );
                                LocationMarker layoutLocationMarker29 = new LocationMarker( //야외공연장
                                        127.45398,
                                        36.62711,
                                        getExampleView(exampleLayoutRenderable29)
                                );
                                LocationMarker layoutLocationMarker30 = new LocationMarker( // 박물관
                                        127.45532,
                                        36.62766,
                                        getExampleView(exampleLayoutRenderable30)
                                );
                                LocationMarker layoutLocationMarker31 = new LocationMarker( //양성재
                                        127.45238,
                                        36.62743,
                                        getExampleView(exampleLayoutRenderable31)
                                );
                                LocationMarker layoutLocationMarker32 = new LocationMarker( //제2학생회관
                                        127.45430,
                                        36.62796,
                                        getExampleView(exampleLayoutRenderable32)
                                );
                                LocationMarker layoutLocationMarker33 = new LocationMarker( //농업생명환경대학
                                        127.45281,
                                        36.62974,
                                        getExampleView(exampleLayoutRenderable33)
                                );



                                //렌더링 될 때마다 다음의 함수 실행
                                layoutLocationMarker.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable.getView();
                                            TextView textView = eView.findViewById(R.id.textView);
                                            textView.setText("법학전문대학 N2");
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
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {
                                            View eView2 = exampleLayoutRenderable2.getView();
                                            TextView textView = eView2.findViewById(R.id.textView3);
                                            textView.setText("대학본부 N10");
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

                                layoutLocationMarker3.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable3.getView();
                                            TextView textView = eView.findViewById(R.id.textView5);
                                            textView.setText("공동실험실습관 N11");
                                            TextView distanceTextView = eView.findViewById(R.id.textView6);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable3.getView();
                                            TextView textView = eView.findViewById(R.id.textView5);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView6);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker4.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable4.getView();
                                            TextView textView = eView.findViewById(R.id.textView7);
                                            textView.setText("중앙도서관 N12");
                                            TextView distanceTextView = eView.findViewById(R.id.textView8);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable4.getView();
                                            TextView textView = eView.findViewById(R.id.textView7);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView8);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker5.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable5.getView();
                                            TextView textView = eView.findViewById(R.id.textView9);
                                            textView.setText("경영학관 N13");
                                            TextView distanceTextView = eView.findViewById(R.id.textView10);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable5.getView();
                                            TextView textView = eView.findViewById(R.id.textView9);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView10);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker6.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable6.getView();
                                            TextView textView = eView.findViewById(R.id.textView11);
                                            textView.setText("인문사회관 N14");
                                            TextView distanceTextView = eView.findViewById(R.id.textView12);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable6.getView();
                                            TextView textView = eView.findViewById(R.id.textView11);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView12);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker7.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable7.getView();
                                            TextView textView = eView.findViewById(R.id.textView13);
                                            textView.setText("사회과학대학 N15");
                                            TextView distanceTextView = eView.findViewById(R.id.textView14);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable7.getView();
                                            TextView textView = eView.findViewById(R.id.textView13);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView14);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker8.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable8.getView();
                                            TextView textView = eView.findViewById(R.id.textView15);
                                            textView.setText("미술관 N16-2");
                                            TextView distanceTextView = eView.findViewById(R.id.textView16);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable8.getView();
                                            TextView textView = eView.findViewById(R.id.textView15);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView16);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker9.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable9.getView();
                                            TextView textView = eView.findViewById(R.id.textView17);
                                            textView.setText("개성재 N17");
                                            TextView distanceTextView = eView.findViewById(R.id.textView18);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable9.getView();
                                            TextView textView = eView.findViewById(R.id.textView17);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView18);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker10.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable10.getView();
                                            TextView textView = eView.findViewById(R.id.textView19);
                                            textView.setText("생활과학대학 N20-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView20);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.RED);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable10.getView();
                                            TextView textView = eView.findViewById(R.id.textView19);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView20);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker11.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable11.getView();
                                            TextView textView = eView.findViewById(R.id.textView21);
                                            textView.setText("사범대학강의동 E1-2");
                                            TextView distanceTextView = eView.findViewById(R.id.textView22);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable11.getView();
                                            TextView textView = eView.findViewById(R.id.textView21);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView22);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker12.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable12.getView();
                                            TextView textView = eView.findViewById(R.id.textView23);
                                            textView.setText("개신문화관 E2");
                                            TextView distanceTextView = eView.findViewById(R.id.textView24);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable12.getView();
                                            TextView textView = eView.findViewById(R.id.textView23);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView24);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker13.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable13.getView();
                                            TextView textView = eView.findViewById(R.id.textView25);
                                            textView.setText("제1학생회관 E3");
                                            TextView distanceTextView = eView.findViewById(R.id.textView26);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable13.getView();
                                            TextView textView = eView.findViewById(R.id.textView25);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView26);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker14.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable14.getView();
                                            TextView textView = eView.findViewById(R.id.textView27);
                                            textView.setText("의과대학 1호관 E7-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView28);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable14.getView();
                                            TextView textView = eView.findViewById(R.id.textView27);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView28);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker15.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable15.getView();
                                            TextView textView = eView.findViewById(R.id.textView29);
                                            textView.setText("공과대학 본관 E8-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView30);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable15.getView();
                                            TextView textView = eView.findViewById(R.id.textView29);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView30);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker16.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable16.getView();
                                            TextView textView = eView.findViewById(R.id.textView31);
                                            textView.setText("전자정보 1관 E8-7");
                                            TextView distanceTextView = eView.findViewById(R.id.textView32);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable16.getView();
                                            TextView textView = eView.findViewById(R.id.textView31);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView32);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker17.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable17.getView();
                                            TextView textView = eView.findViewById(R.id.textView33);
                                            textView.setText("제5공학관 E8-10");
                                            TextView distanceTextView = eView.findViewById(R.id.textView34);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable17.getView();
                                            TextView textView = eView.findViewById(R.id.textView33);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView34);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker18.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable18.getView();
                                            TextView textView = eView.findViewById(R.id.textView35);
                                            textView.setText("양진재 E8-11");
                                            TextView distanceTextView = eView.findViewById(R.id.textView36);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable18.getView();
                                            TextView textView = eView.findViewById(R.id.textView35);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView36);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker19.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable19.getView();
                                            TextView textView = eView.findViewById(R.id.textView37);
                                            textView.setText("학연산 E9");
                                            TextView distanceTextView = eView.findViewById(R.id.textView38);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable19.getView();
                                            TextView textView = eView.findViewById(R.id.textView37);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView38);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker20.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable20.getView();
                                            TextView textView = eView.findViewById(R.id.textView39);
                                            textView.setText("전자정보 2관 E10");
                                            TextView distanceTextView = eView.findViewById(R.id.textView40);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable20.getView();
                                            TextView textView = eView.findViewById(R.id.textView39);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView40);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker21.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable21.getView();
                                            TextView textView = eView.findViewById(R.id.textView41);
                                            textView.setText("수의과대학 및 동물병원 E12-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView42);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.BLUE);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable21.getView();
                                            TextView textView = eView.findViewById(R.id.textView41);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView42);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker22.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable22.getView();
                                            TextView textView = eView.findViewById(R.id.textView43);
                                            textView.setText("자연대 1호관 S1-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView44);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable22.getView();
                                            TextView textView = eView.findViewById(R.id.textView43);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView44);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker23.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable23.getView();
                                            TextView textView = eView.findViewById(R.id.textView45);
                                            textView.setText("자연대 3호관 S1-3");
                                            TextView distanceTextView = eView.findViewById(R.id.textView46);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable23.getView();
                                            TextView textView = eView.findViewById(R.id.textView45);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView46);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker24.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable24.getView();
                                            TextView textView = eView.findViewById(R.id.textView47);
                                            textView.setText("자연대 6호관 S1-6");
                                            TextView distanceTextView = eView.findViewById(R.id.textView48);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable24.getView();
                                            TextView textView = eView.findViewById(R.id.textView47);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView48);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker25.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable25.getView();
                                            TextView textView = eView.findViewById(R.id.textView49);
                                            textView.setText("과학기술도서관 S1-7");
                                            TextView distanceTextView = eView.findViewById(R.id.textView50);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable25.getView();
                                            TextView textView = eView.findViewById(R.id.textView49);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView50);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker26.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable26.getView();
                                            TextView textView = eView.findViewById(R.id.textView51);
                                            textView.setText("전산정보원 S2");
                                            TextView distanceTextView = eView.findViewById(R.id.textView52);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable26.getView();
                                            TextView textView = eView.findViewById(R.id.textView51);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView52);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker27.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable27.getView();
                                            TextView textView = eView.findViewById(R.id.textView53);
                                            textView.setText("전자정보 3관 S4-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView54);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable27.getView();
                                            TextView textView = eView.findViewById(R.id.textView53);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView54);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker28.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable28.getView();
                                            TextView textView = eView.findViewById(R.id.textView55);
                                            textView.setText("나이팅게일관 S4-2");
                                            TextView distanceTextView = eView.findViewById(R.id.textView56);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable28.getView();
                                            TextView textView = eView.findViewById(R.id.textView55);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView56);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker29.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable29.getView();
                                            TextView textView = eView.findViewById(R.id.textView57);
                                            textView.setText("야외공연장 S8");
                                            TextView distanceTextView = eView.findViewById(R.id.textView58);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable29.getView();
                                            TextView textView = eView.findViewById(R.id.textView57);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView58);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker30.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable30.getView();
                                            TextView textView = eView.findViewById(R.id.textView59);
                                            textView.setText("박물관 S9");
                                            TextView distanceTextView = eView.findViewById(R.id.textView60);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable30.getView();
                                            TextView textView = eView.findViewById(R.id.textView59);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView60);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker31.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable31.getView();
                                            TextView textView = eView.findViewById(R.id.textView61);
                                            textView.setText("양성재 S17-1");
                                            TextView distanceTextView = eView.findViewById(R.id.textView62);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable31.getView();
                                            TextView textView = eView.findViewById(R.id.textView61);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView62);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker32.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable32.getView();
                                            TextView textView = eView.findViewById(R.id.textView63);
                                            textView.setText("제2학생회관 S14");
                                            TextView distanceTextView = eView.findViewById(R.id.textView64);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable32.getView();
                                            TextView textView = eView.findViewById(R.id.textView63);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView64);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                layoutLocationMarker33.setRenderEvent(new LocationNodeRender() {
                                    @Override
                                    public void render(LocationNode node) {
                                        distance = node.getDistance();
                                        if(distance < Maxdistance) {   //거리가 300을 초과할 시
                                            View eView = exampleLayoutRenderable33.getView();
                                            TextView textView = eView.findViewById(R.id.textView65);
                                            textView.setText("농업생명환경대학 S21-4");
                                            TextView distanceTextView = eView.findViewById(R.id.textView66);
                                            distanceTextView.setText(node.getDistance() + "M");
                                            eView.setBackgroundColor(Color.GREEN);
                                        }
                                        else{
                                            View eView = exampleLayoutRenderable33.getView();
                                            TextView textView = eView.findViewById(R.id.textView65);
                                            textView.setText("");
                                            TextView distanceTextView = eView.findViewById(R.id.textView66);
                                            distanceTextView.setText("");
                                            eView.setBackgroundColor(00000000);
                                        }
                                    }
                                });

                                // locationScene.mLocationMarkers에 넣음으로 렌더링 될 대상에 포함시킴
                                locationScene.mLocationMarkers.add(layoutLocationMarker);
                                locationScene.mLocationMarkers.add(layoutLocationMarker2);
                                locationScene.mLocationMarkers.add(layoutLocationMarker3);
                                locationScene.mLocationMarkers.add(layoutLocationMarker4);
                                locationScene.mLocationMarkers.add(layoutLocationMarker5);
                                locationScene.mLocationMarkers.add(layoutLocationMarker6);
                                locationScene.mLocationMarkers.add(layoutLocationMarker7);
                                locationScene.mLocationMarkers.add(layoutLocationMarker8);
                                locationScene.mLocationMarkers.add(layoutLocationMarker9);
                                locationScene.mLocationMarkers.add(layoutLocationMarker10);
                                locationScene.mLocationMarkers.add(layoutLocationMarker11);
                                locationScene.mLocationMarkers.add(layoutLocationMarker12);
                                locationScene.mLocationMarkers.add(layoutLocationMarker13);
                                locationScene.mLocationMarkers.add(layoutLocationMarker14);
                                locationScene.mLocationMarkers.add(layoutLocationMarker15);
                                locationScene.mLocationMarkers.add(layoutLocationMarker16);
                                locationScene.mLocationMarkers.add(layoutLocationMarker17);
                                locationScene.mLocationMarkers.add(layoutLocationMarker18);
                                locationScene.mLocationMarkers.add(layoutLocationMarker19);
                                locationScene.mLocationMarkers.add(layoutLocationMarker20);
                                locationScene.mLocationMarkers.add(layoutLocationMarker21);
                                locationScene.mLocationMarkers.add(layoutLocationMarker22);
                                locationScene.mLocationMarkers.add(layoutLocationMarker23);
                                locationScene.mLocationMarkers.add(layoutLocationMarker24);
                                locationScene.mLocationMarkers.add(layoutLocationMarker25);
                                locationScene.mLocationMarkers.add(layoutLocationMarker26);
                                locationScene.mLocationMarkers.add(layoutLocationMarker27);
                                locationScene.mLocationMarkers.add(layoutLocationMarker28);
                                locationScene.mLocationMarkers.add(layoutLocationMarker29);
                                locationScene.mLocationMarkers.add(layoutLocationMarker30);
                                locationScene.mLocationMarkers.add(layoutLocationMarker31);
                                locationScene.mLocationMarkers.add(layoutLocationMarker32);
                                locationScene.mLocationMarkers.add(layoutLocationMarker33);

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
