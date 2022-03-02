package workshop.MatcherNumber;

import workshop.MatcherNumber.PatternMatcher;

import java.util.List;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */
public class FizzBuzz {
    private List<PatternMatcher> patternMatchers;
    private PatternMatcher nullObjectPattern;
    public FizzBuzz(List<PatternMatcher> patternMatchers, PatternMatcher nullObjectPattern) {
        super();
        this.patternMatchers = patternMatchers;
        this.nullObjectPattern = nullObjectPattern;
    }

    public String say(int number) {
        StringBuilder strReturn = new StringBuilder(nullObjectPattern.generateRresponse());

        for (PatternMatcher patternMatcher : patternMatchers) {
            if (patternMatcher.matches(number)) strReturn.append(patternMatcher.generateRresponse());
        }

        if(strReturn.toString().equals(nullObjectPattern.generateRresponse())) return String.valueOf(number);
        else return strReturn.toString();
    }
}