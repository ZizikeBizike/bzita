package com.greenfoxacademy.openlibraryapp.models;

import java.util.List;

public class WorksBySubjectResponse {

    private String subjectType;
    private String name;
    private String key;
    private int eBookCount;
    private List<Work> works;

    public String getSubjectType() {
        return subjectType;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int geteBookCount() {
        return eBookCount;
    }

    public List<Work> getWorks() {
        return works;
    }
}
