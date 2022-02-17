package workshop.MatcherNumber;

public class ThreeMatcher implements PatternMatcher {
    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getResponse() {
        return "Fizz";
    }
}
