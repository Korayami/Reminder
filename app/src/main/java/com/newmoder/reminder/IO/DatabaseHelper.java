package com.newmoder.reminder.IO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.androidauthority.com/how-to-store-data-locally-in-android-app-717190/
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "reminder_database";
    private static String DATABASE_INIT_SQL;

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        try {
            assert context != null;
            BufferedReader r = new BufferedReader(new InputStreamReader(context.getAssets().open("initTables.sql")));
            StringBuilder total = new StringBuilder();
            for(String line; (line = r.readLine()) != null;){
                total.append(line).append('\n');
            }
            DATABASE_INIT_SQL = total.toString();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_INIT_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
