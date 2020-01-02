package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionRepository {

    public static final String GET_QUESTION_QUERY = "SELECT id, question, A, B, C, D, rightanswer FROM \"questions\" ";
    private final Connection connection;
    List<Question> questions = new ArrayList<>();

    public QuestionRepository(Connection c) {
        this.connection = c;
    }

    /**
     * Method downloading questions from database
     */
    void loadQuestions() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(GET_QUESTION_QUERY);

        while (resultSet.next()) {
            Question question = new Question();
            question.setId(resultSet.getInt(1));
            question.setQuestionBody(resultSet.getString(2));
            question.setA(resultSet.getString(3));
            question.setB(resultSet.getString(4));
            question.setC(resultSet.getString(5));
            question.setD(resultSet.getString(6));
            question.setRightAnswer(resultSet.getString(7));
            questions.add(question);
        }
    }

    /**
     * Method asking 3 random questions from list downloaded from database
     */
    void askQuestions() {
        int answered = 0;
        int answeredCorrectly = 0;
        System.out.println("WYBIERZ WŁASCIWĄ ODPOWIEDŹ (A,B, C lub D).");

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(questions.size());
            System.out.println(questions.get(randomNumber).toString());
            Scanner s = new Scanner(System.in);
            String answer = s.next();
            answered++;
            if (answer.equalsIgnoreCase(questions.get(randomNumber).getRightAnswer())) {
                answeredCorrectly++;
                System.out.println("DOBRZE!");
            } else {
                System.out.println("ŻLE :(");
            }
        }
        System.out.println("Koniec testu. Odpowiedziałaś/-łeś poprawnie na " + answeredCorrectly + " z " + answered + " pytań.");
    }
}
