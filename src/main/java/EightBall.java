import java.util.ArrayList;

public class EightBall {

    ArrayList<String> answers;


    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int answerCount() {
         return this.answers.size();
    }

    public ArrayList<String> getAnswers() {
        ArrayList<String> answersCopy = new ArrayList<>(this.answers);
        return answersCopy;
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }
}
