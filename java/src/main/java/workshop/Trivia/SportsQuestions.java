package workshop.Trivia;

import java.util.LinkedList;

public class SportsQuestions implements Questions{
    private LinkedList<String> questions = new LinkedList<>();
    @Override
    public void addQuestion(int index) {
        this.questions.add("Sports Question " + index);
    }

    public boolean matchType(String type){
        return type.equals("Sports");
    }

    @Override
    public String getQuestion() {
        return questions.removeFirst();
    }
}
