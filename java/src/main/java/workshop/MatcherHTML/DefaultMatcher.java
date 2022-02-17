package workshop.MatcherHTML;

public class DefaultMatcher implements MatcherHTML{

    String add = "";

    @Override
    public boolean matches(char charToCheck) {
        add = String.valueOf(charToCheck);
        return true;
    }

    @Override
    public Results getResponse(Results results) {
        results.addConvertedLine(add);
        return results;
    }
}
