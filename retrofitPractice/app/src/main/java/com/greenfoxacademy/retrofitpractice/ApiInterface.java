package com.greenfoxacademy.retrofitpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/posts/1/comments")
    Call<List<Contact>> getContacts();
}
