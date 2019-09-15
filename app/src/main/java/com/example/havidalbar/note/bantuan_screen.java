package com.example.havidalbar.note;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class bantuan_screen extends AppCompatActivity {
    private static int loadingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantuan_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(bantuan_screen.this,input2Activity.class);
                startActivity(intent);
                finish();
            }
        },loadingScreen=4000);
    }
}