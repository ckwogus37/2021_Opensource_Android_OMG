package com.example.firstcbnu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Search extends AppCompatActivity {
    private List<String> items = Arrays.asList("자연과학대학","소프트웨어학과","공과대학");
//    사용자가 검색할 항목들 String

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        SearchView searchView = findViewById(R.id.search_bar);  //검색바
        TextView resultTextView = findViewById(R.id.search_text);   //검색항목
        resultTextView.setText(getResult());    //검색항목 출력 메소드

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String input_text) {    //검색할 내역들 출력메소드
                resultTextView.setText(search_filter(input_text));
                return true;
            }
        });
    }

    private String search_filter(String query) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < items.size(); i++) {
            String item = items.get(i);
            if (item.toLowerCase().contains(query.toLowerCase())) {
                sb.append(item);
                if (i != items.size() - 1) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    private String getResult() {    //검색 항목들 개행시켜주는 메소드 (출력 메소드)
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < items.size(); i++) {
            String item = items.get(i);
            sb.append(item);
            if(i != items.size() - 1){
                sb.append("\n");
            }
        }
        return sb.toString();

    }
}