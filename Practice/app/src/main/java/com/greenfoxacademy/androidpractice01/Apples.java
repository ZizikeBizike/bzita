package com.greenfoxacademy.androidpractice01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Bacon.class);
        EditText applesInput = (EditText) findViewById(R.id.applesInput);
        String message = applesInput.getText().toString();
        intent.putExtra("applesMessage", message);
        startActivity(intent);
    }
}
