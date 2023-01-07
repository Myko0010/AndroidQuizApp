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


    private static List<QuestionsList> chapter1Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();
        

        final QuestionsList question1 = new QuestionsList("1, Android is -", "A. an operating system", "B.  a web browser", "C. a web server", "D. None", "A. an operating system", "");
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
    private static List<QuestionsList> chapter2Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("1, We require an AVD to create an emulator. What does AVD stand for?", "A. Android Virtual device", "B. Android Virtual display", "C. Active Virtual display", "D. Active Virtual device", "A. Android Virtual device", "");
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
    private static List<QuestionsList> chapter3Questions() {
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
    private static List<QuestionsList> chapter4Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("1, Which of the following kernel is used in Android?", "A. MAC", "B.  Windows", "C. Linux", "D. Redhat", "C. Linux", "");
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

    /**
     * @param selectedTopicName
     * @return
     */
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Chapter1":
                return chapter1Questions();
            case "Chapter2":
                return chapter2Questions();
            case "Chapter4":
                return chapter4Questions();
            default:
                return chapter3Questions();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}