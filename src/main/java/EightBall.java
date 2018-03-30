import java.util.ArrayList;
import java.util.Collections;

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

    public String randomAnswer() {
        Collections.shuffle(this.answers);
        return answers.get(1);
    }
}
