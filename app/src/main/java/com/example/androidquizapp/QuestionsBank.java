package com.example.androidquizapp;



import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank extends LoginPage {
    static Database database2;
    static  Cursor cursor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
        database2=new Database(this);

    }

    private static List<QuestionsList> javaQuestions() {

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
                List<QuestionsList> questionsLists = javaQuestions();
                return questionsLists;
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