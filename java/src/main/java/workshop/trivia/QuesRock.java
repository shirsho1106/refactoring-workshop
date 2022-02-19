package workshop.trivia;

import java.util.LinkedList;

public class QuesRock implements QuesOperation{
    @Override
    public Object checkCatagory(String catagory, Questions questions) {
        if(catagory == "Rock") return response(questions.getRockQuestions());
        else return null;
    }

    @Override
    public Object response(LinkedList questions) {
        return questions.removeFirst();
    }
}
