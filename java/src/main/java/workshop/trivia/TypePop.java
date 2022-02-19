package workshop.trivia;

public class TypePop implements TypeSetter{
    @Override
    public boolean check(int place) {
        return place % 4 == 0;
    }

    @Override
    public String response() {
        return "Pop";
    }
}
