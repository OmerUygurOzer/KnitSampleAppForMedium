package com.omerozer.knitblogpostapp;

import static com.travelbank.knit.schedulers.KnitSchedulers.IO;
import static com.travelbank.knit.schedulers.KnitSchedulers.MAIN;

import com.travelbank.knit.KnitPresenter;
import com.travelbank.knit.KnitResponse;
import com.travelbank.knit.ModelEvent;
import com.travelbank.knit.Presenter;

/**
 * Created by omerozer on 6/6/18.
 */

@Presenter(value = KnitActivity.class)
public class MainPresenter extends KnitPresenter<KnitActivityViewWrapper,MainPresenterModelAccessor> {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onViewResume() {
        super.onViewResume();
        request(FirstNameModel.GENERATE_FIRSTNAME,IO,MAIN);
    }

    @ModelEvent(FirstNameModel.GENERATE_FIRSTNAME)
    public void receiveFirstName(KnitResponse<String> firstName){
        getViewWrapper().setText(firstName.getBody());
    }

    @ModelEvent(LastNameModel.GENERATE_LASTNAME)
    public void receiveLastName(KnitResponse<String> lastName){
        getViewWrapper().setText(lastName.getBody());
    }
}
