package workshop.Trivia;

import java.util.LinkedList;

public class RockQuestions implements Questions{
    private LinkedList<String> questions = new LinkedList<>();
    @Override
    public void addQuestion(int index) {
        this.questions.add("Rock Question " + index);
    }

    public boolean matchType(String type){
        return type.equals("Rock");
    }

    @Override
    public String getQuestion() {
        return questions.removeFirst();
    }
}
