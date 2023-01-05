package com.example.androidquizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context) {
        super(context, "AndroidQuizApp.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE student(_ID INTEGER PRIMARY KEY AUTOINCREMENT, " + "first_name  TEXT, " + " last_name TEXT," +
                "u_id INTEGER,"+" gender TEXT,"+" department TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS student;");
        onCreate(db);
    }

    public boolean addStudent(String first_name,String last_name,Integer u_id,String gender,String department){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("first_name",first_name);
        cv.put("last_name",last_name);
        cv.put("u_id",u_id);
        cv.put("gender",gender);
        cv.put("department",department);

        long isSucess=db.insert("student",null,cv);
        if(isSucess ==-1){
            return false;
        }
        else return true;
    }

    public int checkStudent(Integer username){
        String username2=username.toString();
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor=db.rawQuery("SELECT * FROM student " + "WHERE u_id = ?", new String[]{username2} );
        int num=cursor.getCount();

        return num;

    }
}
