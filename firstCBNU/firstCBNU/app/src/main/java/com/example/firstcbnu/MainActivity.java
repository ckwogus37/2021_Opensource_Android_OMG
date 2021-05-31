package com.example.firstcbnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String bvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);

        Button arbtn = (Button)findViewById(R.id.arbtn);
        Button searchbtn = (Button)findViewById(R.id.searchbtn);
        Button mapbtn = (Button)findViewById(R.id.mapbtn);

        arbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),AR.class);
                startActivity(intent);
            }
        });

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });


        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Map.class);
                bvalue = mapbtn.getText().toString();   //listview에서 선택된 아이템의 String값을 추출하여 value라는 stirng변수에 저장
                intent.putExtra("건물이름",bvalue);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                startActivity(intent);
            }
        });
    }
}