package workshop.trivia;

import java.util.LinkedList;

public class QuesScience implements QuesOperation{
    @Override
    public Object checkCatagory(String catagory, Questions questions) {
        if(catagory == "Science") return response(questions.getScienceQuestions());
        else return null;
    }

    @Override
    public Object response(LinkedList questions) {
        return questions.removeFirst();
    }
}
