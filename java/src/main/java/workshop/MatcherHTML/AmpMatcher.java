package workshop.MatcherHTML;

public class AmpMatcher implements MatcherHTML{
    @Override
    public boolean matches(char charToCheck) {
        return charToCheck=='&';
    }

    @Override
    public Results getResponse(Results results) {
        results.addConvertedLine("&amp;");
        return results;
    }
}
