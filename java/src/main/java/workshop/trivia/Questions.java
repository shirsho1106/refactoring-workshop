package workshop.trivia;

import java.util.LinkedList;

public class Questions {
    LinkedList popQuestions;
    LinkedList scienceQuestions;
    LinkedList sportsQuestions;
    LinkedList rockQuestions;

    public LinkedList getPopQuestions() {
        return popQuestions;
    }

    public void setPopQuestions(LinkedList popQuestions) {
        this.popQuestions = popQuestions;
    }

    public LinkedList getScienceQuestions() {
        return scienceQuestions;
    }

    public void setScienceQuestions(LinkedList scienceQuestions) {
        this.scienceQuestions = scienceQuestions;
    }

    public LinkedList getSportsQuestions() {
        return sportsQuestions;
    }

    public void setSportsQuestions(LinkedList sportsQuestions) {
        this.sportsQuestions = sportsQuestions;
    }

    public LinkedList getRockQuestions() {
        return rockQuestions;
    }

    public void setRockQuestions(LinkedList rockQuestions) {
        this.rockQuestions = rockQuestions;
    }
}
