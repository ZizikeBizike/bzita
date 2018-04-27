package com.greenfoxacademy.retrofitpractice;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts/1/comments")
    Call<List<Contact>> getContacts();
}
