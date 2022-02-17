package workshop.MatcherHTML;

public class NewLineMatcher implements MatcherHTML{
    @Override
    public boolean matches(char charToCheck) {
        return charToCheck == '\n';
    }

    @Override
    public Results getResponse(Results results) {
        results.addANewLine();
        return results;
    }
}
