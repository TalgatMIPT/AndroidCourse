package com.talgat.layoutcreatingtask2;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NotesStorage.create(this);
    }
}
