package com.example.weatherfragment.ui.changeCity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangeCityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChangeCityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}