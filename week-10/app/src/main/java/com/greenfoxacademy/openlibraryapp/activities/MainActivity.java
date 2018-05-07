package com.greenfoxacademy.openlibraryapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.greenfoxacademy.openlibraryapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toToSearchBySubject(View view) {
        Intent intent = new Intent(this, SearchBySubjectActivity.class);
        startActivity(intent);
    }

    public void goToSearchByAuthor(View view) {
        Intent intent = new Intent(this, SearchByAuthorActivity.class);
        startActivity(intent);
    }

    public void goToSearchABookById(View view) {
        Intent intent = new Intent(this, SearchABookByIdActivity.class);
        startActivity(intent);
    }
}
