package workshop.Trivia;

public class Player {
    private String name;
    private int place;
    private int purse;
    private boolean inPenaltyBox;
    private boolean isGettingOutOfPenaltyBox;

    public Player(String name) {
        this.name = name;
        this.place = 0;
        this.purse = 0;
        this.inPenaltyBox = false;
    }

    public boolean isNotGettingOutOfPenaltyBox() {
        return !isGettingOutOfPenaltyBox;
    }

    public void setGettingOutOfPenaltyBox(int roll) {
        isGettingOutOfPenaltyBox = roll%2 != 0;
    }

    public String getCategory() {
        if(place % 4 == 0) return "Pop";
        if((place-1) % 4 == 0) return "Science";
        if((place-2) % 4 == 0) return "Sports";
        return "Rock";
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public boolean isInPenaltyBox() {
        return inPenaltyBox;
    }

    public void setInPenaltyBox(boolean inPenaltyBox) {
        this.inPenaltyBox = inPenaltyBox;
    }

    public Player changePlace(Player currentPlayer, int roll){
        currentPlayer.setPlace(currentPlayer.getPlace() + roll);
        if (currentPlayer.getPlace() > 11) currentPlayer.setPlace(currentPlayer.getPlace()-12);
        return currentPlayer;
    }
}
