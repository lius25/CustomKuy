package com.example.ju.customkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity{
    private EditText phone;
    private Button btn_login,btn_daftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

            btn_login = (Button) findViewById(R.id.btn_login);
            btn_daftar = (Button) findViewById(R.id.btn_daftar);

            btn_daftar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),Regis.class);
                    startActivity(i);
                }
            });


        }

}
