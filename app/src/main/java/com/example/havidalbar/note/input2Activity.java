package com.example.havidalbar.note;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class input2Activity extends AppCompatActivity {
    java.util.ArrayList<ArrayPesan> pesan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }public void onClick10(View v) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        finish();
    }

    public void onClick2(View v) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }



    private int choice = 1;

    public void tampil2(View view) throws IOException {
        EditText edit = (EditText) findViewById(R.id.editText2);

        String s = edit.getText().toString();
        edit.setText("");

//
//        PrintWriter out= new PrintWriter(String.valueOf((getAssets().open("database.txt"))));
//        out.println(s);
//        out.close();


        Calendar calendar = new GregorianCalendar(Locale.getDefault());

        String[] time = calendar.getTime().toString().split(" ");
        if (s.length() != 0) {
            if (choice == 1) {
                pesan.add(new ArrayPesan(s, R.drawable.bara, time[0]+" "+time[2]+" "+time[1]+" "+time[time.length-1]+" "+time[3]));
            } else if (choice == 2) {
                pesan.add(new ArrayPesan(s, R.drawable.barb,time[0]+" "+time[2]+" "+time[1]+" "+time[time.length-1]+" "+time[3]));
            } else if (choice == 3) {
                pesan.add(new ArrayPesan(s, R.drawable.barc, time[0]+" "+time[2]+" "+time[1]+" "+time[time.length-1]+" "+time[3]));
            } else if (choice == 4) {
                pesan.add(new ArrayPesan(s, R.drawable.bard, time[0]+" "+time[2]+" "+time[1]+" "+time[time.length-1]+" "+time[3]));
            } else if (choice == 5) {
                pesan.add(new ArrayPesan(s, R.drawable.bare, time[0]+" "+time[2]+" "+time[1]+" "+time[time.length-1]+" "+time[3]));
            }
        }


        ArrayPesanAdapter pesanAdapter = new ArrayPesanAdapter(this, pesan);
        ListView simpleList = (ListView) findViewById(R.id.pesan);
        simpleList.setAdapter((ListAdapter) pesanAdapter);


    }

    boolean klik = false;

    public void onClick3(View v) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(input2Activity.this);
        View mView = getLayoutInflater().inflate(R.layout.toast_emot, null);
        TextView title = (TextView) findViewById(R.id.title);
        LinearLayout feel = (LinearLayout) findViewById(R.id.feeling);
        LinearLayout detailFeel = (LinearLayout) findViewById(R.id.detailFeel);
        mBuilder.setView(mView);
        AlertDialog dialog = mBuilder.create();

        dialog.show();


    }


    public void feel1(View v) {
        choice = 1;
        Toast.makeText(input2Activity.this, "anda merasa sangat senang :)", Toast.LENGTH_SHORT).show();

        Toast.makeText(input2Activity.this, "Silahkan tekan back untuk melanjutkan", Toast.LENGTH_SHORT).show();
    }

    public void feel2(View v) {
        choice = 2;
        Toast.makeText(input2Activity.this, "anda merasa senang :)", Toast.LENGTH_SHORT).show();

        Toast.makeText(input2Activity.this, "Silahkan tekan back untuk melanjutkan", Toast.LENGTH_SHORT).show();

    }

    public void feel3(View v) {
        choice = 3;
        Toast.makeText(input2Activity.this, "anda tidak merasa apa-apa", Toast.LENGTH_SHORT).show();

        Toast.makeText(input2Activity.this, "Silahkan tekan back untuk melanjutkan", Toast.LENGTH_SHORT).show();

    }

    public void feel4(View v) {
        choice = 4;
        Toast.makeText(input2Activity.this, "anda cukup sedih", Toast.LENGTH_SHORT).show();

        Toast.makeText(input2Activity.this, "Silahkan tekan back untuk melanjutkan", Toast.LENGTH_SHORT).show();

    }

    public void feel5(View v) {
        choice = 5;
        Toast.makeText(input2Activity.this, "anda merasa sangat sedih :(", Toast.LENGTH_SHORT).show();

        Toast.makeText(input2Activity.this, "Silahkan tekan back untuk melanjutkan", Toast.LENGTH_SHORT).show();

    }
}

