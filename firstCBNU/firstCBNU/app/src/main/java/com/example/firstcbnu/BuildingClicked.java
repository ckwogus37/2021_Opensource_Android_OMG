package com.example.firstcbnu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BuildingClicked extends Activity{  //검색 후 **대학 클릭시 넘어오는 액티비티
    private String buildname;
    private String specifibuilding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_clicked);

        Intent clickedintent = getIntent(); //Search.java에서 넘어오는 정보들을 받기위해 "getIntent()"함수의 변수를 선언
        buildname = clickedintent.getStringExtra("대학이름");   //buildname이라는 getIntent변수에 Search.java로 부터 넘어온 선택된 아이템의 string값을 저장한다.

        TextView building_name=(TextView)findViewById(R.id.building_name);  //listview에서 선택한 아이템의 string(대학이름)을 출력할 Textview
        ImageView buildingimg = (ImageView)findViewById(R.id.buildingimg);  //listview에서 선택한 아이템에 따라 보여질 사진을 출력할 Imageview

        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);


        switch(buildname){  //Search.java에서 선택된 아이템의 string값에 따라 switch문을 통해 출력값을 정한다.
            case "전자정보대학" :
                building_name.setText("전자정보대학");
                buildingimg.setImageResource(R.drawable.elecinfoimg);
                btn1.setText("S4-1 전자정보3관");
                btn2.setText("E8-7 전자정보1관");
                btn3.setText("E9 학연산공동기술연구원");
                btn4.setText("E10 전자정보2관");
                break;
            case "자연과학대학" :
                building_name.setText("자연과학대학");
                buildingimg.setImageResource(R.drawable.naturalscien);
                btn1.setText("S1-1 자연대1호관");
                btn2.setText("S1-3 자연대3호관");
                btn3.setText("S1-6 자연대6호관");
                btn4.setText("-");
                break;
            case "공과대학" :
                building_name.setText("공과대학");
                buildingimg.setImageResource(R.drawable.engineerimg);
                btn1.setText("E8-1 공과대학본관");
                btn2.setText("E8-10 제5공학관");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "인문대학" :
                building_name.setText("인문대학");
                buildingimg.setImageResource(R.drawable.humanimg);
                btn1.setText("N14 인문사회관");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "사회과학대학" :
                building_name.setText("사회과학대학");
                buildingimg.setImageResource(R.drawable.socialscienimg);
                btn1.setText("N15 사회과학대학");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "경영대학" :
                building_name.setText("경영대학");
                buildingimg.setImageResource(R.drawable.operationimg);
                btn1.setText("N13 경영대학");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");

                break;
            case "농업생명환경대학" :
                building_name.setText("농업생명환경대학");
                buildingimg.setImageResource(R.drawable.agricultualimg);
                btn1.setText("S21-4 농업생명환경대학");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "사범대학" :
                building_name.setText("사범대학");
                buildingimg.setImageResource(R.drawable.educationimg);
                btn1.setText("E1-2 사범대학강의동");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "생활과학대학" :
                building_name.setText("생활과학대학");
                buildingimg.setImageResource(R.drawable.lifescienimg);
                btn1.setText("N20-1 생활과학대학");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "수의과대학" :
                building_name.setText("수의과대학");
                buildingimg.setImageResource(R.drawable.veterinaryimg);
                btn1.setText("E12-1 수의과대학");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "의과대학" :
                building_name.setText("의과대학");
                buildingimg.setImageResource(R.drawable.medicalimg);
                btn1.setText("E7-1 의과대학1호관");
                btn2.setText("S4-2 나이팅게일관");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "융합학과군" :
                building_name.setText("융합학과군");
                buildingimg.setImageResource(R.drawable.artimg);
                btn1.setText("N16-2 미술관");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                break;
            case "기숙사" :
                building_name.setText("기숙사");
                buildingimg.setImageResource(R.drawable.dormitoryimg);
                btn1.setText("S17-1 양성재");
                btn2.setText("E8-11 양진재");
                btn3.setText("N17-3 개성재");
                btn4.setText("-");
                break;
            case "기타 교내건물(S)" :
                building_name.setText("기타 교내건물(S)");
                buildingimg.setImageResource(R.drawable.scienlibraryimg);
                btn1.setText("S1-7 과학기술도서관");
                btn2.setText("S2 전산정보원");
                btn3.setText("S8 야외공연장");
                btn4.setText("S9 박물관");
                break;
            case "기타 교내건물(N)" :
                building_name.setText("기타 교내건물(N)");
                buildingimg.setImageResource(R.drawable.universityheadimg);
                btn1.setText("N2 법학전문대학원");
                btn2.setText("N10 대학본부");
                btn3.setText("N11 공동실험실습관");
                btn4.setText("N12 중앙도서관");
                break;
            case "기타 교내건물(E)" :
                building_name.setText("기타 교내건물(E)");
                buildingimg.setImageResource(R.drawable.gaesinimg);
                btn1.setText("E2 개신문화관");
                btn2.setText("E3 제1학생회관");
                btn3.setText("-");
                btn4.setText("-");
                break;
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Map.class);
                specifibuilding = (String)btn1.getText();
                intent.putExtra("건물이름",specifibuilding);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Map.class);
                specifibuilding = (String)btn2.getText();
                intent.putExtra("건물이름",specifibuilding);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                if(specifibuilding!="-")
                startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"건물이 없습니다",Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Map.class);
                specifibuilding = (String)btn3.getText();
                intent.putExtra("건물이름",specifibuilding);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                if(specifibuilding!="-")
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"건물이 없습니다",Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Map.class);
                specifibuilding = (String)btn4.getText();
                intent.putExtra("건물이름",specifibuilding);  //Search.java에서 BuildingClicked.java로 넘어갈 때, 선택된 아이템의 string값을 넘겨준다.
                if(specifibuilding!="-")
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"건물이 없습니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
