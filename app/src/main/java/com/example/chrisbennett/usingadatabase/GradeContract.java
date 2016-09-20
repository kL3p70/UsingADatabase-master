package com.example.chrisbennett.usingadatabase;

import android.provider.BaseColumns;

/**
 * Created by chris.bennett on 9/15/16.
 */


public final class GradeContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.

    public static final String TEXT_TYPE = " TEXT";
    public static final String COMMA_SEP = ",";
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Grade.TABLE_NAME + " (" +
                    Grade._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    Grade.COLUMN_NAME_EVENT + TEXT_TYPE + COMMA_SEP +
                    Grade.COLUMN_NAME_GRADE + TEXT_TYPE + COMMA_SEP +
                    Grade.COLUMN_NAME_COURSE + TEXT_TYPE + " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Grade.TABLE_NAME;


    private GradeContract() {}

    /* Inner class that defines the table contents */
    public static class Grade implements BaseColumns {
        public static final String TABLE_NAME = "grades";
        public static final String COLUMN_NAME_EVENT = "event";
        public static final String COLUMN_NAME_GRADE = "grade";
        public static final String COLUMN_NAME_COURSE = "course";

    }




}
