package com.tumininu.roomdatabase.db;

import androidx.room.RoomDatabase;

import com.tumininu.roomdatabase.model.Accessory;

@androidx.room.Database(entities = {Accessory.class}, version = 1)

public abstract class Database extends RoomDatabase {
    private static Database INSTANCE;

    public abstract AccessoryDao accessoryDao();
}
