package program;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {
	// write your code here
        Quiz myQuiz = new Quiz();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Java");
        choices.add("JavaScript");
        Question mult1 = new MultipleChoice("What language is this?", choices, "Java");

        ArrayList<String> answers = new ArrayList<>();
        answers.add("Cat");
        answers.add("Dog");
        answers.add("Crocodile");
        ArrayList<String> correctAnswers = new ArrayList<>();
        correctAnswers.add("Cat");
        correctAnswers.add("Dog");
        Question check1 = new CheckBox("Which of these are acceptable pets?", answers, correctAnswers);

        Question tf = new TrueFalse("This will work", "true");
        ArrayList<Question> questions = new ArrayList<>();
        System.out.println(mult1.toString());
        questions.add(mult1);
        questions.add(check1);
        questions.add(tf);
        myQuiz.addQuestions(questions);
        myQuiz.runQuiz();
        System.out.println("Your Score Is: " + myQuiz.grade());
    }
}
