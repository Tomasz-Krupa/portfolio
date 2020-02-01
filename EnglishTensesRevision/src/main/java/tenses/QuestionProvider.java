package tenses;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionProvider {

    private Connection connection;
    QuestionRepository questionRepository= new QuestionRepository(connection);
    List<Question> questions;
    /**
     * Method asking 3 random questions from list downloaded from database
     */
    void askQuestions () throws SQLException {
        questionRepository.loadQuestions();
        int answered = 0;
        int answeredCorrectly = 0;
        System.out.println("WYBIERZ WŁASCIWĄ ODPOWIEDŹ (A,B, C lub D).");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(questions.size());
            System.out.println(questions.get(randomNumber).toString());
            String answer = scanner.next();
            answered++;
            if (answer.equalsIgnoreCase(questions.get(randomNumber).getRightAnswer())) {
                answeredCorrectly++;
                System.out.println("DOBRZE!");
            } else {
                System.out.println("ŻLE :(");
            }
        }
        scanner.close();
        System.out.println("Koniec testu. Odpowiedziałaś/-łeś poprawnie na " + answeredCorrectly + " z " + answered + " pytań.");
    }
}
