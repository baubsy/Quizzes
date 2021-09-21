package program;

public abstract class Question {
    private String question;
    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Question(String aQuestion){
        this.question = aQuestion;
    }

    public String getQuestion() {
        return question;
    }
    abstract void askQuestion();
}
