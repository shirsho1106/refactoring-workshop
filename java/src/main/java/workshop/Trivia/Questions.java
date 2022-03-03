package workshop.Trivia;

public interface Questions {
    void addQuestion(int index);
    boolean matchType(String type);
    String getQuestion();
}
