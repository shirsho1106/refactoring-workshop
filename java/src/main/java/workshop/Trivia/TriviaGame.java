package workshop.Trivia;

import java.util.ArrayList;
import java.util.List;

public class TriviaGame {

    private final List<Questions> questions;
    private final ArrayList<Player> players = new ArrayList<>();
    private Player currentPlayer;

    public TriviaGame(List<Questions> questions, int howManyQuestions) {
        this.questions = questions;
        addQuestions(howManyQuestions);
    }

    public void add(String playerName) {
        players.add(new Player(playerName));
        announce(playerName + " was added");
        announce("They are player number " + players.size());
        currentPlayer = players.get(0);
    }

    public void roll(int roll) {
        announce(currentPlayer.getName() + " is the current player");
        announce("They have rolled a " + roll);

        if (currentPlayer.isInPenaltyBox()) {
            currentPlayer.setGettingOutOfPenaltyBox(roll);
            if(currentPlayer.isNotGettingOutOfPenaltyBox()){
                announce(currentPlayer.getName() + " is not getting out of the penalty box");
                return;
            }
            announce(currentPlayer.getName() + " is getting out of the penalty box");
        }
        changePlace(roll);
        askQuestion();
    }

    private void askQuestion() {
        for(Questions question : questions){
            if(question.matchType(currentCategory()))
                announce(question.getQuestion());
        }
    }

    private String currentCategory() {
        return currentPlayer.getCategory();
    }

    public void wasCorrectlyAnswered() {
        if (currentPlayer.isInPenaltyBox()) {
            if (currentPlayer.isNotGettingOutOfPenaltyBox()) {
                changePlayer();
                return;
            }
        }
        correctAnnounce();
        changePlayer();
    }

    private void addQuestions(int howManyQuestions){
        for (int i = 0; i < howManyQuestions; i++) {
            for(Questions question : questions){
                question.addQuestion(i);
            }
        }
    }

    public void wrongAnswer() {
        announce("Question was incorrectly answered");
        announce(currentPlayer.getName() + " was sent to the penalty box");
        currentPlayer.setInPenaltyBox(true);
        changePlayer();
    }

    private void correctAnnounce(){
        announce("Answer was correct!!!!");
        currentPlayer.setPurse(currentPlayer.getPurse()+1);
        announce(currentPlayer.getName() + " now has "
                + currentPlayer.getPurse() + " Gold Coins.");
    }

    private void changePlace(int roll){
        currentPlayer = currentPlayer.changePlace(currentPlayer,roll);
        announce(currentPlayer.getName() + "'s new location is " + currentPlayer.getPlace());
        announce("The category is " + currentCategory());
    }

    private void changePlayer(){
        if(players.iterator().hasNext()) currentPlayer = players.iterator().next();
        else currentPlayer = players.get(0);
    }

    protected void announce(Object message) {
        System.out.println(message);
    }
}