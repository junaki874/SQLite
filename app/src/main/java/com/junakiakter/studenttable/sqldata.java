package com.junakiakter.studenttable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqldata extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "Student.db";
    public static final String TABLE_NAME= "Student_table";
    public static final String COL_1= "ID";
    public static final String COL_2= "Name";
    public static final String COL_3= "Surname";
    public static final String COL_4= "Marks";


    public sqldata(Context context) {
        super(context,DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("create table " +TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , Name TEXT, Surname TEXT, Marks INTEGER)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
          db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
          onCreate(db);
    }
}
