package com.example.androidquizapp;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank extends LoginPage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);

       // database2=new Database(this);
    }
    public Cursor getinet(){
        Database database2=new Database(this);
        Cursor cursor =  database2.GetSpecificQuestion("Chapter1");
        return cursor;
    }

    private static List<QuestionsList> javaQuestions() {
           QuestionsBank tsest=new QuestionsBank();
           Cursor cursor2=tsest.getinet();

        final List<QuestionsList> questionsLists = new ArrayList<>();
        while(cursor2.moveToNext()){
          String question,choiceA,choiceB,choiceC,choiceD,Answer;
          question=cursor2.getString(2);
            choiceA=cursor2.getString(3);
            choiceB=cursor2.getString(4);
            choiceC=cursor2.getString(5);
            choiceD=cursor2.getString(6);
            Answer=cursor2.getString(7);
            final QuestionsList question1 = new QuestionsList(""+question, ""+choiceA, ""+choiceB, ""+choiceC, ""+choiceD, ""+Answer, "");
            questionsLists.add(question1);

        }



        return questionsLists;

    }
    private static List<QuestionsList> phpQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question2 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question3 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question4 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question5 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question6 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> htmlQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question2 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question3 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question4 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question5 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question6 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> androidQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question2 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question3 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question4 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question5 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        final QuestionsList question6 = new QuestionsList("a", "b", "c", "d", "e", "b", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    /**
     * @param selectedTopicName
     * @return
     */
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}