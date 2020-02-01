package tenses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

    private int id;
    private String questionBody;
    private String A;
    private String B;
    private String C;
    private String D;
    private String rightAnswer;

    public String toString() {
        return
                        id + ". " +
                        questionBody + '\n' +
                        "A) " + A + '\n' +
                        "B) " + B + '\n' +
                        "C) " + C + '\n' +
                        "D) " + D + '\n';
    }
}
