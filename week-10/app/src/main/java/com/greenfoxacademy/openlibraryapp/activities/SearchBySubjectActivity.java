package com.greenfoxacademy.openlibraryapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.greenfoxacademy.openlibraryapp.R;

public class SearchBySubjectActivity extends AppCompatActivity {

    public static final String SUBJECT = "com.greenfoxacademy.openlibraryapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_subject);
    }

    public void sendSubject(View view) {
        Intent intent = new Intent(this, SubjectResult.class);
        EditText subject_editText = (EditText) findViewById(R.id.subject_editText);
        String subject = subject_editText.getText().toString();
        intent.putExtra(SUBJECT, subject);
        startActivity(intent);
    }
}
