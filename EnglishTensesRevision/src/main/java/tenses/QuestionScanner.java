package tenses;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionScanner {

        /**
         * Method scanning question from console
         */
        void questionFactory (Question question){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj treść pytania:");
            question.setQuestionBody(scanner.next());
            System.out.println("Podaj odpowiedź A:");
            question.setA(scanner.next());
            System.out.println("Podaj odpowiedź B:");
            question.setB(scanner.next());
            System.out.println("Podaj odpowiedź C:");
            question.setC(scanner.next());
            System.out.println("Podaj odpowiedź D:");
            question.setD(scanner.next());
            System.out.println("Podaj właściwą odpowiedź:");
            question.setRightAnswer(scanner.next());
        }
    }

