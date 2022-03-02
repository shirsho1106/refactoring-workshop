package workshop.MatcherHTML;

public class LtSignMatcher implements CharMatcher{
    @Override
    public String matchAndConvert(String line, char match) {
        if(match=='<') line += "&lt;";
        return line;
    }
}
