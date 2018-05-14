package com.shenkar.amitshwartz.birthdaysapp;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;

@Entity
public class User {
    @PrimaryKey
    private int id;

    private String name;

    private String bDate;

    public User(String name, String bDate, int id) {
        this.name = name;
        this.bDate = bDate;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getbDate() {
        return bDate;
    }
}
