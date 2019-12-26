package EnglishWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Aplikacja konsolowa do powtarzania słówek z języka angielskiego.
 */
public class EnglishWordsQuiz {

    private static List<EnglishWords.Question> list = new ArrayList<>();

    public static void main(String[] args) {
        // dodanie pytań do listy
        list.add(new Question(1, "JAK JEST PO ANGIELSKU BIAŁY: \n A) BLUE,\n B) BLACK,\n C) WHITE,\n D) PINK.", "C"));
        list.add(new Question(2, "JAK JEST PO ANGIELSKU PIES: \n A) DOUG,\n B) DOG,\n C) CAT,\n D) CAIT.", "B"));
        list.add(new Question(3, "JAK JEST PO ANGIELSKU KSIĄŻKA: \n A) BOOK,\n B) BOOG,\n C) COOK,\n D) CLOCK.", "A"));
        list.add(new Question(4, "JAK JEST PO ANGIELSKU WESOŁY: \n A) RHINO,\n B) RENAULT,\n C) HIPO,\n D) HAPPY.", "D"));
        list.add(new Question(5, "JAK JEST PO ANGIELSKU NIEBO: \n A) SKYPE,\n B) RAIN,\n C) RAINBOW,\n D) SKY.", "D"));
        list.add(new Question(6, "JAK JEST PO ANGIELSKU CZARNY: \n A) BLUE,\n B) BLACK,\n C) WHITE,\n D) PINK.", "B"));
        list.add(new Question(7, "JAK JEST PO ANGIELSKU HIPOPOTAM: \n A) RHINO,\n B) RENAULT,\n C) HIPO,\n D) HAPPY.", "C"));
        list.add(new Question(8, "JAK JEST PO ANGIELSKU NOSOROŻEC: \n A) RHINO,\n B) RENAULT,\n C) HIPO,\n D) HAPPY.", "A"));
        list.add(new Question(9, "JAK JEST PO ANGIELSKU SZARA RYBA: \n A) GREY BIRD,\n B) BROWN BIRD,\n C) GREY FISH,\n D) BROWN FISH.", "C"));
        list.add(new Question(10, "JAK JEST PO ANGIELSKU BRĄZOWY PTAK: \n A) GREY BIRD,\n B) BROWN BIRD,\n C) GREY FISH,\n D) BROWN FISH.", "B"));
        list.add(new Question(11, "JAK JEST PO ANGIELSKU SŁOŃCE: \n A) MOON,\n B) MOUNT,\n C) SON,\n D) SUN.", "D"));
        list.add(new Question(12, "JAK JEST PO ANGIELSKU KSIĘŻYC: \n A) MOON,\n B) MOUNT,\n C) SON,\n D) SUN.", "A"));
        list.add(new Question(13, "JAK JEST PO ANGIELSKU KSIĄŻĘ: \n A) PRICK,\n B) PRINCESS,\n C) PRINGLES,\n D) PRINCE.", "D"));
        list.add(new Question(14, "JAK JEST PO ANGIELSKU STÓŁ: \n A) TABLE,\n B) TABLET,\n C) CHAIR,\n D) CHILD.", "A"));
        list.add(new Question(15, "JAK JEST PO ANGIELSKU KOŃ: \n A) HEN,\n B) DEER,\n C) COW,\n D) HORSE.", "D"));
        list.add(new Question(16, "JAK JEST PO ANGIELSKU LAS: \n A) FOREX,\n B) FOREST,\n C) FORHEAD,\n D) FOSTER.", "B"));
        list.add(new Question(17, "JAK JEST PO ANGIELSKU DRZEWO: \n A) THREE,\n B) FREE,\n C) TREE,\n D) THIRD.", "C"));
        list.add(new Question(18, "JAK JEST PO ANGIELSKU MAŁPA: \n A) MONKEY,\n B) KANGAROO,\n C) ELEPHANT,\n D) ANT.", "A"));
        list.add(new Question(19, "JAK JEST PO ANGIELSKU LEW: \n A) LEFT,\n B) LION,\n C) SION,\n D) LIAR.", "B"));
        list.add(new Question(20, "JAK JEST PO ANGIELSKU MLEKO: \n A) MILD,\n B) TEA,\n C) MILK,\n D) TEAR.", "C"));
        list.add(new Question(21, "JAK JEST PO ANGIELSKU TATA: \n A) DADDY,\n B) FATHER,\n C) MUMMY,\n D) MOTHER.", "A"));
        list.add(new Question(22, "JAK JEST PO ANGIELSKU CÓRKA: \n A) SON,\n B) TSOORCK,\n C) DAUGHTER,\n D) DODDY.", "C"));
        list.add(new Question(23, "JAK JEST PO ANGIELSKU RODZINA: \n A) MAN,\n B) BARELY,\n C) FRIENDS,\n D) FAMILY.", "D"));
        list.add(new Question(24, "JAK JEST PO ANGIELSKU DOM: \n A) HOME,\n B) ALONE,\n C) DOWN,\n D) DUMMY.", "A"));
        list.add(new Question(25, "JAK JEST PO ANGIELSKU MAŁY: \n A) STROLL,\n B) SMOG,\n C) SMALL,\n D) SMOUG.", "C"));
        list.add(new Question(26, "JAK JEST PO ANGIELSKU GŁOWA: \n A) HEAD,\n B) HEARD,\n C) SHOULDER,\n D) SHOOTER.", "A"));
        list.add(new Question(27, "JAK JEST PO ANGIELSKU NOGA: \n A) HAND,\n B) FOOT,\n C) FOOTBALL,\n D) HANDLE.", "B"));
        list.add(new Question(28, "JAK JEST PO ANGIELSKU PTAK: \n A) BIRCH,\n B) BIRD,\n C) THROW,\n D) FEAR.", "B"));
        list.add(new Question(29, "JAK JEST PO ANGIELSKU NOS: \n A) FEARS,\n B) EARS,\n C) MOUSE,\n D) NOSE.", "D"));
        list.add(new Question(30, "JAK JEST PO ANGIELSKU OWCA: \n A) SHEEP,\n B) SHIP,\n C) OWL,\n D) BABA.", "A"));
        list.add(new Question(31, "JAK JEST PO ANGIELSKU ROLNIK: \n A) FARM,\n B) ROLLER,\n C) FARMER,\n D) ROLLING.", "C"));
        list.add(new Question(32, "JAK JEST PO ANGIELSKU CIASTKO: \n A) COOKIE,\n B) BISCUIT,\n C) CANDY,\n D) MILKY WAY.", "A"));
        list.add(new Question(32, "JAK JEST PO ANGIELSKU JESIEŃ: \n A) OTTER ,\n B) WINTER,\n C) AUTOMN,\n D) WIND.", "C"));
        list.add(new Question(33, "JAK JEST PO ANGIELSKU BAWIĆ SIĘ: \n A) BASIC ,\n B) GREAT,\n C) PLAY,\n D) GREY.", "C"));

        // zadaj wylosowane pytania z listy
        askQuestions(list);
    }

    /**
     * Metoda do zadawania pytań z listy.
     *
     * @param questionsList
     */

    private static void askQuestions(List<Question> questionsList) {
        int answered = 0;                                                               //licznik pytań odpowiedzianych
        int answeredCorrectly = 0;                                                      //licznik prawidłowych odpowiedzi
        System.out.println("WYBIERZ WŁASCIWĄ ODPOWIEDŹ (A,B, C lub D).");
//       for (Question q : set)
        for (int i = 0; i < 6; i++) {
            Random random = new Random();                                                  // pętla losuje 6 numerów pytań
            int randomNumber = random.nextInt(questionsList.size());                       //losuje dowolną liczbę z zakresu listy pytań
            System.out.println(questionsList.get(randomNumber).id + ". " + questionsList.get(randomNumber).question);     //wyświetla pytanie i jego ID
            Scanner s = new Scanner(System.in);
            String answer = s.next();
            answered++;
            if (answer.equalsIgnoreCase(questionsList.get(randomNumber).rightAnswer)) {
                answeredCorrectly++;
                System.out.println("DOBRZE!");
            } else {
                System.out.println("ŻLE :(");
            }
        }
        System.out.println("Koniec testu. Odpowiedziałaś/-łeś poprawnie na " + answeredCorrectly + " z " + answered + " pytań.");
    }
}





