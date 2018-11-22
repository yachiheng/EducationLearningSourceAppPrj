package com.example.user.educationlearningsource;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A5 extends Activity {

    private View.OnClickListener btn1_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://ocw.nctu.edu.tw/course.php"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn2_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://ocw.lib.ntnu.edu.tw/"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn3_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://ocw.aca.ntu.edu.tw/ntu-ocw/"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn4_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://ocw.nthu.edu.tw/"));
            startActivity(intent);

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a5);
        initialComponent();
    }

    private void initialComponent() {
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_click);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_click);
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_click);
        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_click);
    }


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
}
