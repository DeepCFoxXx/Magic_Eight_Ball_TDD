import java.util.ArrayList;

public class EightBall {

    ArrayList<String> answers;


    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int answerCount() {
         return this.answers.size();
    }
}
