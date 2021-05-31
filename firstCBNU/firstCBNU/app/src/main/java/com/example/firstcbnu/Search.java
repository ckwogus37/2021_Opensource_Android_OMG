package com.example.firstcbnu;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search extends AppCompatActivity {

    ListView lv;
    ArrayAdapter adapter;
    ArrayList<String> showlist;
    SearchView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);    //listview가 있는 xml과 연결
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);
        lv = (ListView) findViewById(R.id.list);    //search.xml파일에 있는 listview를 선언
        sv = (SearchView) findViewById(R.id.search_bar);    //search.xml파일에 있는 searchview를 선언

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                VoiceTask voiceTask = new VoiceTask();
                voiceTask.execute();
            }
        });


        showlist= new ArrayList<>();    //listview에 보여질 대학들의 배열리스트

        showlist.add("전자정보대학"); //showlist 0번 인덱스
        showlist.add("자연과학대학");
        showlist.add("공과대학");
        showlist.add("인문대학");
        showlist.add("사회과학대학");
        showlist.add("경영대학");
        showlist.add("농업생명환경대학");
        showlist.add("사범대학");
        showlist.add("생활과학대학");
        showlist.add("수의과대학");
        showlist.add("의과대학");
        showlist.add("융합학과군");
        showlist.add("기숙사");
        showlist.add("기타 교내건물(S)");
        showlist.add("기타 교내건물(N)");
        showlist.add("기타 교내건물(E)"); //showlist의 15번 인덱스

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, showlist);    //showlist의 아이템들을 apdater라는 필터를 거치게한다.
        lv.setAdapter(adapter); //adpater라는 필터를 거친 후의 결과값들을 listview에 보여준다.
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {    //searchview 함수의 검색시 발생하는 이벤트
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }   //검색바에 입력 후, 엔터를 눌러야지만 발생하는 이벤트

            @Override
            public boolean onQueryTextChange(String newText) {      //searchview검색창에 사용자가 입력할 때 마다 결과값을 최신화하는 이벤트
                adapter.getFilter().filter(newText);    //adapter의 filter기능을 통해 사용자가 검색한 키워드를 포함하는 아이템만을 출력하게 한다.
                return false;
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) { //listview의 아이템을 클릭시 발생하는 이벤트
                Intent intent = new Intent(getApplicationContext(), BuildingClicked.class);
                String value = parent.getItemAtPosition(position).toString();   //listview에서 선택된 아이템의 String값을 추출하여 value라는 stirng변수에 저장
                intent.putExtra("대학이름",value);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                startActivity(intent);  //BuildingClicked.java로 넘어간다.

            }
        });


    }
    public class VoiceTask extends AsyncTask<String, Integer, String> {
        String str = null;

        @Override
        protected String doInBackground(String... params) {
            // TODO Auto-generated method stub
            try {
                getVoice();
            } catch (Exception e) {
                // TODO: handle exception
            }
            return str;
        }

        @Override
        protected void onPostExecute(String result) {
            try {

            } catch (Exception e) {
                Log.d("onActivityResult", "getImageURL exception");
            }
        }
    }

    private void getVoice() {

        Intent intent = new Intent();
        intent.setAction(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

        String language = "ko-KR";

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, language);
        startActivityForResult(intent, 2);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            ArrayList<String> results = data
                    .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

            String str = results.get(0);
            adapter.getFilter().filter(str);
            Toast.makeText(getBaseContext(), str +"이(가) 입력되었습니다.", Toast.LENGTH_LONG).show();
        }
    }


}