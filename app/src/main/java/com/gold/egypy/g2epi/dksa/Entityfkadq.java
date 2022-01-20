package com.gold.egypy.g2epi.dksa;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "dsjkq")
public class Entityfkadq {

    @ColumnInfo(name = "cont")
    public String savevevev;

    @PrimaryKey(autoGenerate = true)
    int id;

    public Entityfkadq(String savevevev) {
        this.savevevev = savevevev;
    }
}
