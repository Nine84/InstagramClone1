package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KijOY9YpW1DPT8pA2FbaWX9tsmFClbwCoke3IGNQ")
                // if defined
                .clientKey("fXdBF0LzmZgS9FzI5lNTQFyFtYxwsLClAllTwIia")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
