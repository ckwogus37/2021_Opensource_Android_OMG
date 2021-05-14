package com.example.firstcbnu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BuildingClicked extends Activity{  //검색 후 **대학 클릭시 넘어오는 경우
    private int img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_clicked);

        Intent intent = getIntent();

        TextView building_name=(TextView)findViewById(R.id.building_name);


    }
}
