package com.example.ju.customkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splas extends AppCompatActivity {
    private int SLEEP_TIMER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splas);
        getSupportActionBar().hide();
        logolauncher logolauncher = new logolauncher();
        logolauncher.start();

    }

    private class logolauncher extends Thread{

        public void run (){
            try{
                sleep(1000* SLEEP_TIMER);
            } catch (InterruptedException e){
                e.printStackTrace();

            }

            Intent intent = new Intent(Splas.this,Login.class);
            startActivity(intent);

            Splas.this.finish();

        }
    }

}
