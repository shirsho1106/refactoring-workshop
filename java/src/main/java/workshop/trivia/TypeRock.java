package workshop.trivia;

public class TypeRock implements TypeSetter{
    @Override
    public boolean check(int place) {
        return place % 4 == 3;
    }

    @Override
    public String response() {
        return "Rock";
    }
}
