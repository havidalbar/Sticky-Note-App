package com.example.havidalbar.note;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class loadingActivity extends AppCompatActivity {
private static int loadingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(loadingActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    },loadingScreen=3000);
}
}
