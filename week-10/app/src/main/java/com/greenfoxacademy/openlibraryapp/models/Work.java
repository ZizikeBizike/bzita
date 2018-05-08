package com.greenfoxacademy.openlibraryapp.models;

import java.util.List;

public class Work {

    private String title;
    private List<Author> authors;

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
