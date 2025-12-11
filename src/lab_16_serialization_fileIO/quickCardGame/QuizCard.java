package lab_16_serialization_fileIO.quickCardGame;

import java.io.Serializable;

public class QuizCard implements Serializable {
    private String question;
    private String answer;

    public QuizCard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "QuizCard{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
