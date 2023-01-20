package com.engel.meters;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MeterViewModel extends AndroidViewModel {
    private MeterDAO meterDao;
    private MutableLiveData<Boolean> shouldCloseScreen = new MutableLiveData<>();
    List<Meter> list = new ArrayList<>();

    public MeterViewModel(@NonNull Application application){
        super(application);
        meterDao = MeterDataBase.getInstance(application).meterDAO();
    }

    public LiveData<Boolean> getShouldCloseScreen(){
        return shouldCloseScreen;
    }

    public void saveMeter(Meter meter){
        Thread thread = new Thread(() -> {
            meterDao.add(meter);
           // shouldCloseScreen.postValue(true);
        });
        thread.start();
    }

    public List<Meter> loadMeters(){

        Thread thread = new Thread(() -> list = meterDao.getMeters());
        thread.start();
        return list;
    }
}
