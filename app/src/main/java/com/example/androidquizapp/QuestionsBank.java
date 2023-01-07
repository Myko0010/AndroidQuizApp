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



        final QuestionsList question1 = new QuestionsList("1, Android is -", "A. an operating system", "B.  a web browser", "C. a web browser", "D. None", "A. an operating system", "");
        final QuestionsList question2 = new QuestionsList("2, For which of the following Android is mainly developed?", "A.  for Servers", "B. for Dektops", "C. for laptops", "D. for mobile devices", "D. for mobile devices", "");
        final QuestionsList question3 = new QuestionsList("3,  Which of the following virtual machine is used by the Android operating system?", "A. JVM", "B. DVM", "C. Simple virtual machine", "D. None", "B. DVM", "");
        final QuestionsList question4 = new QuestionsList("4, What does API stand for?", "A. Application Programming Interface", "B. Android Programming Interface", "C. Android Page Interface", "D. Application Page Interface", "A. Application Programming Interface", "");
        final QuestionsList question5 = new QuestionsList("5, Which of the following converts Java byte code into Dalvik byte code?", "A. Dalvik converter", "B. Dex compiler", "C. Mobile interpretive compiler (MIC)", "D None", "B. Dex compiler", "");
        final QuestionsList question6 = new QuestionsList("6, What is an activity in android?", "A android class", "B. android package", "C. A single screen in an application with supporting java code", "D none", "C. A single screen in an application with supporting java code", "");
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

        final QuestionsList question1 = new QuestionsList("1, Android is -", "A. an operating system", "B.  a web browser", "C. a web browser", "D. None", "A. an operating system", "");
        final QuestionsList question2 = new QuestionsList("2, For which of the following Android is mainly developed?", "A.  for Servers", "B. for Dektops", "C. for laptops", "D. for mobile devices", "D. for mobile devices", "");
        final QuestionsList question3 = new QuestionsList("3,  Which of the following virtual machine is used by the Android operating system?", "A. JVM", "B. DVM", "C. Simple virtual machine", "D. None", "B. DVM", "");
        final QuestionsList question4 = new QuestionsList("4, What does API stand for?", "A. Application Programming Interface", "B. Android Programming Interface", "C. Android Page Interface", "D. Application Page Interface", "A. Application Programming Interface", "");
        final QuestionsList question5 = new QuestionsList("5, Which of the following converts Java byte code into Dalvik byte code?", "A. Dalvik converter", "B. Dex compiler", "C. Mobile interpretive compiler (MIC)", "D None", "B. Dex compiler", "");
        final QuestionsList question6 = new QuestionsList("6, What is an activity in android?", "A android class", "B. android package", "C. A single screen in an application with supporting java code", "D none", "C. A single screen in an application with supporting java code", "");
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

        final QuestionsList question1 = new QuestionsList("1, Android is -", "A. an operating system", "B.  a web browser", "C. a web browser", "D. None", "A. an operating system", "");
        final QuestionsList question2 = new QuestionsList("2, For which of the following Android is mainly developed?", "A.  for Servers", "B. for Dektops", "C. for laptops", "D. for mobile devices", "D. for mobile devices", "");
        final QuestionsList question3 = new QuestionsList("3,  Which of the following virtual machine is used by the Android operating system?", "A. JVM", "B. DVM", "C. Simple virtual machine", "D. None", "B. DVM", "");
        final QuestionsList question4 = new QuestionsList("4, What does API stand for?", "A. Application Programming Interface", "B. Android Programming Interface", "C. Android Page Interface", "D. Application Page Interface", "A. Application Programming Interface", "");
        final QuestionsList question5 = new QuestionsList("5, Which of the following converts Java byte code into Dalvik byte code?", "A. Dalvik converter", "B. Dex compiler", "C. Mobile interpretive compiler (MIC)", "D None", "B. Dex compiler", "");
        final QuestionsList question6 = new QuestionsList("6, What is an activity in android?", "A android class", "B. android package", "C. A single screen in an application with supporting java code", "D none", "C. A single screen in an application with supporting java code", "");
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
            case "Chapter1":
                return javaQuestions();
            case "Chapter2":
                return phpQuestions();
            case "Chapter4":
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