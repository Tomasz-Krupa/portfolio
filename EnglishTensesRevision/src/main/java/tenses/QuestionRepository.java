package tenses;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionRepository {

    public static final String GET_QUESTION_QUERY = "SELECT id, question, A, B, C, D, rightanswer FROM \"questions\" ";
    public static final String ADD_QUESTION_QUERY = "INSERT INTO \"questions\" (question, A, B, C, D, rightanswer) VALUES (?,?,?,?,?,?) ";

    private final Connection connection;
    public List<Question> questions = new ArrayList<>();

    public QuestionRepository(Connection c) {
        this.connection = c;
    }

    /**
     * Method adding new question to database
     */
    void addQuestion(Question question) throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(ADD_QUESTION_QUERY);
            new QuestionScanner().questionFactory(question);
            statement.setString(1, question.getQuestionBody());
            statement.setString(2, question.getA());
            statement.setString(3, question.getB());
            statement.setString(4, question.getC());
            statement.setString(5, question.getD());
            statement.setString(6, question.getRightAnswer());
            statement.executeUpdate();
            System.out.println("Pytanie dodano do bazy");
        } catch (SQLException e) {
            System.out.println("Nie udało się dodać pytania.");
            e.printStackTrace();
        }
    }

    /**
     * Method downloading questions from database
     */
    void loadQuestions() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(GET_QUESTION_QUERY);

        try {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method asking 3 random questions from list downloaded from database
     */
    void askQuestions() throws SQLException {
        loadQuestions();
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
        System.out.println("Koniec testu. Odpowiedziałaś/-łeś poprawnie na " + answeredCorrectly + " z " + answered + " pytań.");
    }
}

