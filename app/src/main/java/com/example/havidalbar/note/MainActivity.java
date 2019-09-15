package com.example.havidalbar.note;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bx,bRewind,tv1,tv2,tv3,tv4,bclear;
    String satu,dua,tiga,empat,password="",passwordBenar="1111";
    int parameter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        b0 = (TextView) findViewById(R.id.b0);
        b1 = (TextView) findViewById(R.id.tvtitle);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);
        b4 = (TextView) findViewById(R.id.b4);
        b5 = (TextView) findViewById(R.id.b5);
        b6 = (TextView) findViewById(R.id.b6);
        b7 = (TextView) findViewById(R.id.b7);
        b8 = (TextView) findViewById(R.id.b8);
        b9 = (TextView) findViewById(R.id.b9);
        bRewind = (TextView) findViewById(R.id.brewind);
        bclear = (TextView) findViewById(R.id.bclear);
        findViewById(R.id.tvtitle).setOnClickListener(MainActivity.this);
        findViewById(R.id.brewind).setOnClickListener(MainActivity.this);
        findViewById(R.id.bclear).setOnClickListener(MainActivity.this);
        findViewById(R.id.b0).setOnClickListener(MainActivity.this);
        findViewById(R.id.b1).setOnClickListener(MainActivity.this);
        findViewById(R.id.b2).setOnClickListener(MainActivity.this);
        findViewById(R.id.b3).setOnClickListener(MainActivity.this);
        findViewById(R.id.b4).setOnClickListener(MainActivity.this);
        findViewById(R.id.b5).setOnClickListener(MainActivity.this);
        findViewById(R.id.b6).setOnClickListener(MainActivity.this);
        findViewById(R.id.b7).setOnClickListener(MainActivity.this);
        findViewById(R.id.b8).setOnClickListener(MainActivity.this);
        findViewById(R.id.b9).setOnClickListener(MainActivity.this);

    }private void Handler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Vibrator v =  (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(100);
                clear();
            }
        },300);
        }
    private void rewind(){
        switch (parameter){
            case 0:
                break;
            case 1:
                satu="";
                tv1.setVisibility(View.GONE);
                parameter-=1;
                break;
            case 2:
                dua="";
                tv2.setVisibility(View.GONE);
                parameter-=1;
                break;
            case 3:
                tiga="";
                tv3.setVisibility(View.GONE);
                parameter-=1;
                break;
            case 4:
                empat="";
                tv4.setVisibility(View.GONE);
                parameter-=1;
                break;
        }
}
    private void clear(){
                tv1.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv4.setVisibility(View.GONE);
                parameter=0;
                Log.d("cekparameter", String.valueOf(parameter));
                password="";
        }
    private void cekKode(int kode,String isian){
        if (kode<4){
        switch (kode){
            case 0:
                satu = isian;
                tv1.setVisibility(View.VISIBLE);
                parameter++;
                break;
            case 1:
                dua = isian;
                tv2.setVisibility(View.VISIBLE);
                parameter++;
                break;
            case 2:
                tiga = isian;
                tv3.setVisibility(View.VISIBLE);
                parameter++;
                break;
            case 3:
                empat = isian;
                tv4.setVisibility(View.VISIBLE);
                parameter++;
                cekBenarSalah();
                break;
        }}}
        private void cekBenarSalah(){
            password+=satu+dua+tiga+empat;
            Log.d("CekPassword", password);
            if (password.equalsIgnoreCase(passwordBenar)){
                startActivity(new Intent(MainActivity.this, bantuan_screen.class));
                finish();
            }else{
                Handler();
            }
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b0:
                cekKode(parameter,"0");
                break;
            case R.id.b1:
                cekKode(parameter,"1");
                break;
            case R.id.b2:
                cekKode(parameter,"2");
                break;
            case R.id.b3:
                cekKode(parameter,"3");
                break;
            case R.id.b4:
                password+="4";
                cekKode(parameter,"4");
                break;
            case R.id.b5:
                cekKode(parameter,"5");
                break;
            case R.id.b6:
                cekKode(parameter,"6");
                break;
            case R.id.b7:
                cekKode(parameter,"7");
                break;
            case R.id.b8:
                cekKode(parameter,"8");
                break;
            case R.id.b9:
                cekKode(parameter,"9");
                break;
            case R.id.brewind:
                rewind();
                break;
            case R.id.bclear:
                clear();
                break;
        }
    }


}
