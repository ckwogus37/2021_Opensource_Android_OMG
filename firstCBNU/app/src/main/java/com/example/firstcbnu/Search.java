package com.example.firstcbnu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search extends AppCompatActivity {

    int unversity=0;
    ListView lv;
    ArrayAdapter adapter;
    ArrayList<String> list1;
    SearchView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);    //listview가 있는 xml과 연결

        lv = (ListView) findViewById(R.id.list);
        sv = (SearchView) findViewById(R.id.search_bar);
        list1 = new ArrayList<String>();
        list1.add("전자정보대학");    //university 1
        list1.add("자연과학대학");    //university 2
        list1.add("공과대학");       //university 3
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list1);
        lv.setAdapter(adapter);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), BuildingClicked.class);

                startActivity(intent);
            }
        });

    }

}