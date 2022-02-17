package workshop.MatcherHTML;

public class LessMatcher implements MatcherHTML{
    @Override
    public boolean matches(char charToCheck) {
        return charToCheck == '<';
    }

    @Override
    public Results getResponse(Results results) {
        results.addConvertedLine("&lt;");
        return results;
    }
}
