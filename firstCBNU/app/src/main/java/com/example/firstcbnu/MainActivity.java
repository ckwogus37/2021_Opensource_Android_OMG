package com.example.firstcbnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);

//        Button b = (Button) findViewById(R.id.button);
//        Button b2 = (Button) findViewById(R.id.button2);
//        Button b3 = (Button) findViewById(R.id.button3);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),AR.class);
//                startActivity(intent);
//            }
//        });

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

//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),Search.class);
//                startActivity(intent);
//            }
//        });

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });

//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),Location.class);
//                startActivity(intent);
//            }
//        });

        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Location.class);
                startActivity(intent);
            }
        });
    }
}