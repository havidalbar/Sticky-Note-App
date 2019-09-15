package com.example.havidalbar.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }
    public void onClick12(View v) {
        Intent intent = new Intent(HelpActivity.this, input2Activity.class);
        startActivity(intent);
    }
}
