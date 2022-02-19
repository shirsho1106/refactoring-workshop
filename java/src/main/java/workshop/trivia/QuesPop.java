package workshop.trivia;

import java.util.LinkedList;

public class QuesPop implements QuesOperation{
    @Override
    public Object checkCatagory(String catagory, Questions questions) {
        if(catagory == "Pop") return response(questions.getPopQuestions());
        else return null;
    }

    @Override
    public Object response(LinkedList questions) {
        return questions.removeFirst();
    }
}
