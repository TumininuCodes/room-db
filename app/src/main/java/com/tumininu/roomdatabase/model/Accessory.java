package com.tumininu.roomdatabase.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Accessories")
public class Accessory {
    @PrimaryKey
    private int accessoryId;

    private String accessoryName;

    private int accessoryPoints;

    private int accessoryPurchased;

    public Accessory(int accessoryId, String accessoryName, int accessoryPoints,
                     int accessoryPurchased) {
        this.accessoryId = accessoryId;
        this.accessoryName = accessoryName;
        this.accessoryPoints = accessoryPoints;
        this.accessoryPurchased = accessoryPurchased;
    }
}
