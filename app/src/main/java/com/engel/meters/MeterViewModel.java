package com.engel.meters;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MeterViewModel extends AndroidViewModel {
    private MeterDataBase meterDataBase;
    private MutableLiveData<Boolean> shouldCloseScreen = new MutableLiveData<>();
    List<Meter> list = new ArrayList<>();

    public MeterViewModel(@NonNull Application application){
        super(application);
        meterDataBase = MeterDataBase.getInstance(application);
    }

    public LiveData<Boolean> getShouldCloseScreen(){
        return shouldCloseScreen;
    }

    public void saveMeter(Meter meter){
        Thread thread = new Thread(() -> {
            meterDataBase.meterDAO().update(meter);
           // shouldCloseScreen.postValue(true);
        });
        thread.start();
    }

    public List<Meter> loadMeters(){

        Thread thread = new Thread(() -> list = meterDataBase.meterDAO().getMeters());
        thread.start();
        return list;
    }
}
