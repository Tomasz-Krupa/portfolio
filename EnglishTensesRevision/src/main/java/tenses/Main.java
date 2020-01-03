package tenses;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DBconnector.connect();
        QuestionRepository questionRepository = new QuestionRepository(connection);
        questionRepository.loadQuestions();
        questionRepository.askQuestions();
        connection.close();
    }
}
