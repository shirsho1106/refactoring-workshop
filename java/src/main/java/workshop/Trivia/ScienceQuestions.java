package workshop.Trivia;

import java.util.LinkedList;

public class ScienceQuestions implements Questions {
    private LinkedList<String> questions = new LinkedList<>();
    @Override
    public void addQuestion(int index) {
        this.questions.add("Science Question " + index);
    }

    public boolean matchType(String type){
        return type.equals("Science");
    }

    @Override
    public String getQuestion() {
        return questions.removeFirst();
    }
}
