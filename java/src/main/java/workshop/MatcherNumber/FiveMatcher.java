package workshop.MatcherNumber;

public class FiveMatcher implements PatternMatcher{
    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getResponse() {
        return "Buzz";
    }
}
