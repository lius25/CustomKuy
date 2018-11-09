package com.example.ju.customkuy;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Regis extends AppCompatActivity {


    private Button btn_masuk, btn_submit, btn_reset;
    private EditText nama, no_telp, alamat, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        getSupportActionBar().hide();

        btn_masuk = (Button) findViewById(R.id.btn_masuk);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_reset = (Button) findViewById(R.id.btn_reset);
        nama = (EditText) findViewById(R.id.nama);
        no_telp = (EditText) findViewById(R.id.no_telp);
        alamat = (EditText) findViewById(R.id.alamat);
        email = (EditText) findViewById(R.id.email);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent submitIntent = new Intent(Regis.this,MainActivity.class);
                Regis.this.startActivity(submitIntent);

            }
        });
        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIntent = new Intent(Regis.this,Login.class);
                Regis.this.startActivity(masukIntent);
            }
        });
    }
}