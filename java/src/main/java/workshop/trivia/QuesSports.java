package workshop.trivia;

import java.util.LinkedList;

public class QuesSports implements QuesOperation{
    @Override
    public Object checkCatagory(String catagory, Questions questions) {
        if(catagory == "Sports") return response(questions.getSportsQuestions());
        else return null;
    }

    @Override
    public Object response(LinkedList questions) {
        return questions.removeFirst();
    }
}
