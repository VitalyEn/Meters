package com.engel.meters;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "meters")
public class Meter {

    @PrimaryKey
    private final int id;
    private final String adress;
    private final int t1_tariff;
    private final int t2_tariff;
    private final int t_tariff;

    public Meter(int id, String adress, int t1_tariff, int t2_tariff, int t_tariff){
        this.id = id;
        this.adress = adress;
        this.t1_tariff = t1_tariff;
        this.t2_tariff = t2_tariff;
        this.t_tariff = t_tariff;
    }

    public int getId(){
        return id;
    }

    public int getT1_tariff() {
        return t1_tariff;
    }

    public int getT2_tariff() {
        return t2_tariff;
    }

    public int getT_tariff() {
        return t_tariff;
    }

    public String getAdress() {
        return adress;
    }
}
