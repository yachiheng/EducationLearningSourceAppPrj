package com.example.user.educationlearningsource;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActMain extends Activity {

    private View.OnClickListener btnElementary_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(ActMain.this,A2.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener btnJunior_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(ActMain.this,A3.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener btnSenior_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(ActMain.this,A4.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener btnCollege_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(ActMain.this,A5.class);
            startActivity(intent);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        initialComponent();
    }

    private void initialComponent() {
        btnElementary=findViewById(R.id.btnElementary);
        btnElementary.setOnClickListener(btnElementary_click);
        btnJunior=findViewById(R.id.btnJunior);
        btnJunior.setOnClickListener(btnJunior_click);
        btnSenior=findViewById(R.id.btnSenior);
        btnSenior.setOnClickListener(btnSenior_click);
        btnCollege=findViewById(R.id.btnCollege);
        btnCollege.setOnClickListener(btnCollege_click);
    }

    Button btnElementary;
    Button btnJunior;
    Button btnSenior;
    Button btnCollege;
}
