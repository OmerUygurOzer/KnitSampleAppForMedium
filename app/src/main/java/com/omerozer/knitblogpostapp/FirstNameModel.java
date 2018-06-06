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
public class FirstNameModel extends KnitModel {

    public static final String GENERATE_FIRSTNAME  = "gfn";

    int testVal1;

    @Override
    public void onCreate() {
        super.onCreate();
        testVal1 = 1234;
        Log.d("MODEL FN","CREATED");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Generates(GENERATE_FIRSTNAME)
    Generator0<String> firstNameGenerator = new Generator0<String>() {
        @Override
        public KnitResponse<String> generate() {
            try {
                Thread.sleep(1000); //To mock an IO operation such as a REST call
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new KnitResponse<>("Omer");
        }
    };
}
