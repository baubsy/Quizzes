package program;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
    private ArrayList<String> answers;
    private String answer;
    MultipleChoice(String aQuestion, ArrayList aAnswers, String aAnswer){
        super(aQuestion);
        this.answers = aAnswers;
        this.answer = aAnswer;
    }
    public boolean grade(){
        return true;
    }
    public void askQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.println("Please type out your choice:");
        for(int i = 0; i < this.answers.size(); i++){
            System.out.println(this.answers.get(i));
        }
        String userInput = input.next();
        if(this.answer.equals(userInput)) {
            this.setPoints(1);
        }
    }
}
