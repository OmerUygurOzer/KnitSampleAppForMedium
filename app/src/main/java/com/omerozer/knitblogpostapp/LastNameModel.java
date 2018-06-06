package com.omerozer.knitblogpostapp;

import android.util.Log;

import com.travelbank.knit.Generates;
import com.travelbank.knit.KnitModel;
import com.travelbank.knit.KnitResponse;
import com.travelbank.knit.Model;
import com.travelbank.knit.generators.Generator0;

/**
 * Created by omerozer on 6/6/18.
 */

@Model
public class LastNameModel extends KnitModel {

    public static final String GENERATE_LASTNAME  = "glnkk";

    int testVal2;

    @Override
    public void onCreate() {
        super.onCreate();
        testVal2 = 12345;
        Log.d("MODEL LN","CREATED");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Generates(GENERATE_LASTNAME)
    Generator0<String> lastNameGenerator = new Generator0<String>() {
        @Override
        public KnitResponse<String> generate() {
            return new KnitResponse<>("Ozer");
        }
    };

}
