package com.example.smartparking.DB;

import android.provider.BaseColumns;

public final class UserReaderContract {

    private UserReaderContract(){}

    public static class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "USER";
        public static final String COLUMN_NAME_TITLE="title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";


    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE" + UserEntry.TABLE_NAME + " (" + UserEntry._ID + " INTEGER　PRIMARY KEY,"
        + UserEntry.COLUMN_NAME_TITLE + " TEXT," + UserEntry.COLUMN_NAME_SUBTITLE + " TEXT)";


    public String getSqlCreateEntries(){
        return SQL_CREATE_ENTRIES;
    }

}
