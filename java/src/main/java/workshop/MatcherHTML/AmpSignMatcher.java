package workshop.MatcherHTML;

public class AmpSignMatcher implements CharMatcher{
    @Override
    public String matchAndConvert(String line, char match) {
        if(match=='&') line += "&amp;";
        return line;
    }
}
