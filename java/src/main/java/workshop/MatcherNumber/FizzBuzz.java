package workshop.MatcherNumber;

import java.util.List;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */

public class FizzBuzz {

    List<PatternMatcher> patternMatchers;

    public FizzBuzz(List<PatternMatcher> patternMatchers) {
        this.patternMatchers = patternMatchers;
    }

    public String say(int number) {

        String strReturn = "";

        for (PatternMatcher patternMatcher: patternMatchers) {
            if(patternMatcher.matches(number)) return patternMatcher.getResponse();
        }

        return strReturn;

    }
}
