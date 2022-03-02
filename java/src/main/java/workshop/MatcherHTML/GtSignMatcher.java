package workshop.MatcherHTML;

public class GtSignMatcher implements CharMatcher{
    @Override
    public String matchAndConvert(String line, char match) {
        if(match=='>') line += "&gt;";
        return line;
    }
}
