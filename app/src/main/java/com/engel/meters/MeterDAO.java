package com.engel.meters;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MeterDAO {
    @Query("SELECT * FROM meters")
    List<Meter> getMeters();

    @Insert
    void add(Meter meter);

    @Query("DELETE FROM meters WHERE id = :id")
    void remove(int id);
}
