package com.example.healtheye.Model;

import androidx.room.TypeConverter;

import java.util.Date;

public class dateTypeConverter {
    @TypeConverter
    public Date longToDate(Long value){
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public Long dateToLong(Date value){
        if (value == null){
            return null;
        }
        else{
            return value.getTime();
        }
    }
}

