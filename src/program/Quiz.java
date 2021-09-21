package program;

import java.util.ArrayList;

public class Quiz {
    public ArrayList<Question> questions;
    //private int score;
    public Quiz(){

    }

    public int grade(){
        int sum = 0;
        for(int i = 0; i < questions.size(); i++){
            sum+= questions.get(i).getPoints();
        }
        //this.score = sum;
        return sum;
    }

    public void addQuestions(ArrayList<Question> questions){
        this.questions = questions;
    }
    public void runQuiz(){
        for(int i = 0; i < questions.size(); i++){
            questions.get(i).askQuestion();
        }

    }
}
