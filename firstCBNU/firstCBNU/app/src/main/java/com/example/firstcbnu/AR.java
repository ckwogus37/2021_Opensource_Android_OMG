package com.example.firstcbnu;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AR extends AppCompatActivity {
    //새로운 CBNU_AR 앱 열기
    private final String packageName = "com.example.CBNU_AR";

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ar);

        // 외부의 CBNU_AR 앱을 실행
        ComponentName cn = new ComponentName(packageName,packageName + ".LocationActivity");
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(cn);
        startActivity(intent);
    }
}