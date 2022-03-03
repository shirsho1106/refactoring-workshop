package workshop.Trivia;

import java.util.LinkedList;

public class PopQuestions implements Questions {
    private LinkedList<String> questions = new LinkedList<>();
    @Override
    public void addQuestion(int index) {
        this.questions.add("Pop Question " + index);
    }

    public boolean matchType(String type){
        return type.equals("Pop");
    }

    @Override
    public String getQuestion() {
        return questions.removeFirst();
    }
}
