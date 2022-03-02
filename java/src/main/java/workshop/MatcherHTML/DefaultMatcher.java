package workshop.MatcherHTML;

public class DefaultMatcher implements CharMatcher{
    @Override
    public String matchAndConvert(String line, char match) {
        if(match != '<' && match != '>' && match !='&') line += match;
        return line;
    }
}
