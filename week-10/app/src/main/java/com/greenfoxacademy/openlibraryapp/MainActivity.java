package com.greenfoxacademy.openlibraryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button searchBySubjectButton;
    Button searchByAuthorButton;
    Button searchABookByIdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBySubjectButton = (Button)findViewById(R.id.bSearchBySubject);
        searchBySubjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchBySubjectActivity.class);
                startActivity(intent);
            }
        });

        searchByAuthorButton = (Button)findViewById(R.id.bSearchByAuthor);
        searchByAuthorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchByAuthorActivity.class);
                startActivity(intent);
            }
        });

        searchABookByIdButton = (Button)findViewById(R.id.bSearchABookById);
        searchABookByIdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchABookByIdActivity.class);
                startActivity(intent);
            }
        });
    }


}
