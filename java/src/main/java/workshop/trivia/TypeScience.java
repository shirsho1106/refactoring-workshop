package workshop.trivia;

public class TypeScience implements TypeSetter{
    @Override
    public boolean check(int place) {
        return place % 4 == 1;
    }

    @Override
    public String response() {
        return "Science";
    }
}
