package com.example.smartparking.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBUserHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "USER";
    public static final String COLUMN_NAME_TITLE="title";
    public static final String COLUMN_NAME_SUBTITLE = "subtitle";

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "UserReader.db";



    public DBUserHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //UserReaderContract userReaderContract = new UserReaderContract();
//        public String SQL_CREATE_ENTRIES =
//                "CREATE TABLE" + UserReaderContract.UserEntry.TABLE_NAME + " (" + UserReaderContract.UserEntry._ID + " INTEGER　PRIMARY KEY,"
//                        + UserReaderContract.UserEntry.COLUMN_NAME_TITLE + " TEXT," + UserReaderContract.UserEntry.COLUMN_NAME_SUBTITLE + " TEXT)";
//        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
