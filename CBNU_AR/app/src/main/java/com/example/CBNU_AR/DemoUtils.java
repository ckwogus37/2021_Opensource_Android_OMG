/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.CBNU_AR;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;

import uk.co.appoly.arcorelocation.utils.ARLocationPermissionHelper;

// AR 사용을 위한 것들. 오픈소스 ARLocation 참고 https://github.com/appoly/ARCore-Location
// 사용중 예외 발생을 처리하기 위함이니 건드리지 말 것.

public class DemoUtils {
  private static final String TAG = "SceneformDemoUtils";

  // 에러 발생시 처리를 위함
  public static void displayError(
      final Context context, final String errorMsg, @Nullable final Throwable problem) {
    final String tag = context.getClass().getSimpleName();
    final String toastText;
    if (problem != null && problem.getMessage() != null) {
      Log.e(tag, errorMsg, problem);
      toastText = errorMsg + ": " + problem.getMessage();
    } else if (problem != null) {
      Log.e(tag, errorMsg, problem);
      toastText = errorMsg;
    } else {
      Log.e(tag, errorMsg);
      toastText = errorMsg;
    }

    new Handler(Looper.getMainLooper())
        .post(
            () -> {
              Toast toast = Toast.makeText(context, toastText, Toast.LENGTH_LONG);
              toast.setGravity(Gravity.CENTER, 0, 0);
              toast.show();
            });
  }

// AR 세션 만들기. 카메라 권한이 필요함.
  public static Session createArSession(Activity activity, boolean installRequested)
      throws UnavailableException {
    Session session = null;
    if (ARLocationPermissionHelper.hasPermission(activity)) {
      switch (ArCoreApk.getInstance().requestInstall(activity, !installRequested)) {
        case INSTALL_REQUESTED:
          return null;
        case INSTALLED:
          break;
      }
      session = new Session(activity);
      Config config = new Config(session);
      config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
      session.configure(config);
    }
    return session;
  }


// 권한에 대한 처리를 위해 만들어둔 함수들
  public static void requestPermission(Activity activity, int requestCode) {
    ActivityCompat.requestPermissions(
        activity, new String[] {Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION}, requestCode);
  }

  public static boolean hasPermission(Activity activity) {
    return ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA)
        == PackageManager.PERMISSION_GRANTED;
  }

  public static boolean shouldShowRequestPermissionRationale(Activity activity) {
    return ActivityCompat.shouldShowRequestPermissionRationale(
        activity, Manifest.permission.CAMERA);
  }

  public static void launchPermissionSettings(Activity activity) {
    Intent intent = new Intent();
    intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
    intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
    activity.startActivity(intent);
  }

  //예외 또는 오류 발생시 메시지 출력을 위한 부분
  public static void handleSessionException(
      Activity activity, UnavailableException sessionException) {
    String message;
    if (sessionException instanceof UnavailableArcoreNotInstalledException) {
      message = "Please install ARCore";
    } else if (sessionException instanceof UnavailableApkTooOldException) {
      message = "Please update ARCore";
    } else if (sessionException instanceof UnavailableSdkTooOldException) {
      message = "Please update this app";
    } else if (sessionException instanceof UnavailableDeviceNotCompatibleException) {
      message = "This device does not support AR";
    } else {
      message = "Failed to create AR session";
      Log.e(TAG, "Exception: " + sessionException);
    }
    Toast.makeText(activity, message, Toast.LENGTH_LONG).show();
  }
}
