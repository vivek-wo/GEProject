package com.vivek.wo.geproject.ui.look;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainLookViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MainLookViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}