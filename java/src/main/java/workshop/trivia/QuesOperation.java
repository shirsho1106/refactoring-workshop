package workshop.trivia;

import java.util.LinkedList;

public interface QuesOperation {
    public Object checkCatagory(String catagory, Questions questions);
    public Object response(LinkedList questions);
}
