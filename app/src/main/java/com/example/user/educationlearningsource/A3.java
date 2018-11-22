package com.example.user.educationlearningsource;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A3 extends Activity {

    private View.OnClickListener btn1_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://siro.moe.edu.tw/fip/index.php"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn2_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://learning.cooc.tp.edu.tw/coocLearning/"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn3_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mathland.idv.tw/"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn4_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.junyiacademy.org/exercisedashboard"));
            startActivity(intent);

        }
    };

    private View.OnClickListener btn5_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://video.cloud.edu.tw/video/"));
            startActivity(intent);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
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
        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_click);
    }




    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
}
