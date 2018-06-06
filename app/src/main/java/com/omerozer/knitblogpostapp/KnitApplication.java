package com.omerozer.knitblogpostapp;

import android.app.Application;

import com.travelbank.knit.Knit;

/**
 * Created by omerozer on 6/6/18.
 */

public class KnitApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Knit.init(this);
    }
}
