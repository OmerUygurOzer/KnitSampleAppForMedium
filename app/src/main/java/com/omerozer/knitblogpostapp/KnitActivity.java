package com.omerozer.knitblogpostapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.travelbank.knit.KnitView;

/**
 * Created by omerozer on 6/6/18.
 */

@KnitView
public class KnitActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        textView = (TextView)findViewById(R.id.text_view);
    }

    public void setText(String text){
        textView.setText(text);
    }
}
