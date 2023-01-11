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

        db.execSQL("CREATE TABLE Questions(_ID INTEGER PRIMARY KEY AUTOINCREMENT, " + "chapter  TEXT, " + " question TEXT," +
                "choiceA text,"+" choiceB TEXT,"+" choiceC TEXT,"+" choiceD TEXT,"+" correctAnswer TEXT);");
        db.execSQL("CREATE TABLE QuizResult(student_uid  TEXT, " + " topic TEXT," +
                "result text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS student;");

        db.execSQL("DROP TABLE IF EXISTS Questions;");

        db.execSQL("DROP TABLE IF EXISTS QuizResult;");
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

    public int checkStudent(Integer password,String username){
        String password2=password.toString();
        String username2=username.toString();
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor=db.rawQuery("SELECT * FROM student " + "WHERE u_id = ? AND first_name = ?" , new String[]{password2,username2} );
        int num=cursor.getCount();

        return num;

    }


    public int checkStudentForRegistration(Integer password){
        String password2=password.toString();

        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor=db.rawQuery("SELECT * FROM student " + "WHERE u_id = ? " , new String[]{password2} );
        int num=cursor.getCount();

        return num;

    }


    public boolean addQuestion(String chapter,String question,String choiceA,String choiceB,String choiceC,String choiceD,String correctAnswer){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("chapter",chapter);
        cv.put("question",question);
        cv.put("choiceA",choiceA);
        cv.put("choiceB",choiceB);
        cv.put("choiceC",choiceC);
        cv.put("choiceD",choiceD);
        cv.put("correctAnswer",correctAnswer);


        long isSucess=db.insert("Questions",null,cv);
        if(isSucess ==-1){
            return false;
        }
        else return true;
    }

    public Cursor GetSpecificQuestion(String chapter){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM Questions " + "WHERE chapter = ?", new String[]{chapter});
        return cursor;
    }
public Integer checkQuestion(String question){
        return 0;
}


    public void AddResult(String s_uid,String topic,String result){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("student_uid",s_uid);
        cv.put("topic",topic);
        cv.put("result",result);


        long isSucess=db.insert("QuizResult",null,cv);

    }

    public String getResult(){
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor =db.query("QuizResult",new String[] {"student_uid","topic","result"},
                null,null,null,null,null);

        int Student_uid1=cursor.getColumnIndex("student_uid");
        int topic1=cursor.getColumnIndex("topic");
        int result1=cursor.getColumnIndex("result");

        String res="Student UID       Chapter   QUIZ RESULT\n";
        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            res=res+
                    ""+cursor.getString(Student_uid1)+"            "+
                    ""+cursor.getString(topic1)+"                  "+
                    ""+cursor.getString(result1)+"\n\n";
        }
        db.close();
        return res;

    }

    public Cursor searchStudent(String uid){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM student " + "WHERE u_id = ?",new String[] {uid});

        return cursor;
    }

    public Integer deleteStudent(String id){

        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete("student","u_id = ?",new String[] {id});

    }

    public Integer checkQuizStatus(String chapter,String u_id){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM QuizResult " + "WHERE student_uid = ? AND topic= ?",new String[] {u_id,chapter});
        Integer result=cursor.getCount();
        return result;

    }


}
