package tenses;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DBconnector.connect()) {
            QuestionRepository questionRepository = new QuestionRepository(connection);
            boolean finish = false;

            while (finish == false) {
                String action = getAction().toUpperCase();
                switch (action) {
                    case "D": {
                        questionRepository.addQuestion(new Question());
                        break;
                    }
                    case "T": {
                        questionRepository.askQuestions();
                        break;
                    }
                    case "K": {
                        finish = true;
                        break;
                    }
                    default: {
                        System.out.println("Podano niewłaściwą akcję.");
                        break;
                    }
                }
            }
        }
    }

    static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz akcję: start testu (T), dodaj pytanie (D) lub koniec (K):");
        return scanner.next();
    }
}
