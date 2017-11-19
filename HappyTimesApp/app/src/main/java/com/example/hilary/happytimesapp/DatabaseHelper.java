package com.example.hilary.happytimesapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HILARY on 11/14/2017.
 */

public class DatabaseHelper  extends SQLiteOpenHelper {
    public DatabaseHelper(Context context, int version) {
        super(context,null, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insertData(){


    }
}
