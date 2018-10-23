package com.example.android.bvp1;

public class Word {
    private String question;
    private String answer;
    public Word(String ques, String ans)
    {
        question = ques;
        answer = ans;
    }
    public String getquestion()
    {
        return question;
    }
    public String getanswer()
    {
        return answer;
    }
}
