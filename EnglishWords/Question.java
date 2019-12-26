package EnglishWords;

class Question{
    int id;
    String question;
    String rightAnswer;

    Question(int id, String question, String rightAnswer) {
        this.id = id;
        this.question = question;
        this.rightAnswer = rightAnswer;
    }

    @Override
    public String toString() {
        return "Pytanie: " +
                "id=" + id +
                ". question='" + question + '\'';
    }
}
