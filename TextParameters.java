package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Application displaying numbers of words, letters and vowels in a text in a separete text file.
 */
public class TextParameters {

    /** Method calculating number of words letters, also Polish diacritics (exluding digits and other characters)
     */
    static void countLetters(String text) {
        int numberOfLetters = 0;

        try {
            for (int sign = 0; sign < text.length(); sign++) {
                if (Character.toString(text.charAt(sign)).matches("[a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ]")) {
                    numberOfLetters++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The text is empty");
        }

        System.out.println("Number of letters: " + numberOfLetters);
    }


    /** Method calculating number of words counted by a number of spaces
     */
    static void countWords(String text) {


        int numberOfWords = 1;
        try {
            for (int sign = 0; sign < text.length(); sign++) {
                if (text.charAt(sign) == ' ') {
                    numberOfWords++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The text is empty");
        }
        if (text.equals("")) {
            numberOfWords = 0;
        }
        System.out.println("Number of words: " + numberOfWords);
    }

    /** Method calculating number of vowels
     */
    static void countVowels(String text) {
        int numberOfVowels = 0;

        try {
            for (int sign = 0; sign < text.length(); sign++) {
                if (Character.toString(text.charAt(sign)).matches("[aeiouyąęAEIOUYĄĘ]")) {
                    numberOfVowels++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The text is empty");
        }

        System.out.println("Number of vowels: " + numberOfVowels);
    }

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("text.txt");
        PrintWriter printWriter = new PrintWriter("text.txt");          //creating of a new file, to be sure it exists
        printWriter.println("When I find myself in times of trouble, ");          // adding some text
        printWriter.println("Mother Mary comes to me, ...");
        printWriter.close();

        Scanner in = new Scanner(file);
        String text= new String();
        while (in.hasNext())
        {text= new StringBuilder(text).append(in.nextLine()).toString();}       //reading text from the file


        System.out.println(text);                                               //printing out results of tha analyse
        TextParameters.countWords(text);
        TextParameters.countLetters(text);
        TextParameters.countVowels(text);

    }


}
