package com.greenfoxacademy.loadingspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pgsBar;
    private Button showbtn, hidebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgsBar = (ProgressBar)findViewById(R.id.pBar);
        showbtn = (Button)findViewById(R.id.btnShow);
        hidebtn = (Button)findViewById(R.id.btnHide);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgsBar.setVisibility(v.VISIBLE);
            }
        });

        hidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgsBar.setVisibility(View.GONE);
            }
        });
    }
}
