package workshop.trivia;

public class TypeSports implements TypeSetter{
    @Override
    public boolean check(int place) {
        return place % 4 == 2;
    }

    @Override
    public String response() {
        return "Sports";
    }
}
