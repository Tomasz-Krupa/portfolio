package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Tenses {

    public static void main(String[] args) throws SQLException {

        Connection connection = DBconnector.connect();
        QuestionRepository questionRepository = new QuestionRepository(connection);
        questionRepository.loadQuestions();
        questionRepository.askQuestions();
    }
}
