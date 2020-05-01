package com.example.dbroom;



//import android.arch.persistence.room.Database;
//import android.arch.persistence.room.RoomDatabase;
import androidx.room.RoomDatabase;
import androidx.room.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
