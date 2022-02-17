package workshop.MatcherHTML;

public class GtMatcher implements MatcherHTML{
    @Override
    public boolean matches(char charToCheck) {
        return charToCheck == '>';
    }

    @Override
    public Results getResponse(Results results) {
        results.addConvertedLine("&gt;");
        return results;
    }
}
