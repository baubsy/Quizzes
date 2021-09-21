package program;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question{
    private ArrayList<String> possibleAnswers;
    private ArrayList<String> actualAnswers;

    public CheckBox(String question, ArrayList aPossibleAnswers, ArrayList aActualAnswers){
        super(question);
        this.actualAnswers = aActualAnswers;
        this.possibleAnswers = aPossibleAnswers;
    }

    public boolean grade(){
        return true;
    }

    public void askQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.println("Please type your answers from these choices seperated by commas and no spaces");
        for(int i = 0; i < possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }
        String userInput = input.next();
        boolean correct = true;
        for(int t = 0; t < actualAnswers.size(); t++){
            if(!userInput.contains(actualAnswers.get(t))){
                correct = false;
            }
        }
        if(correct){
            this.setPoints(1);
        }
    }
}
