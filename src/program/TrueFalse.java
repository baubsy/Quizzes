package program;

import java.util.Scanner;

public class TrueFalse extends Question{
    private String answer;

    public TrueFalse(String question, String aAnswer){
        super(question);
        this.answer = aAnswer;
    }

    public boolean grade(){
        return true;
    }

    public void askQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.println("type in true or false");
        String userInput = input.next();

        if(this.answer.equals(userInput)){
            this.setPoints(1);
        }
    }
}
