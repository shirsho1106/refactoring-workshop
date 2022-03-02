package workshop.MatcherHTML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {

    private List<CharMatcher> charMatchers;

    public PlaintextToHtmlConverter(List<CharMatcher> charMatchers) {
        this.charMatchers = charMatchers;
    }

    public String toHtml() throws Exception {
        String text = read();
        return basicHtmlEncode(text);
    }

    public String read() throws IOException {
        Path filePath = Paths.get("sample.txt");
        byte[] fileByteArray = Files.readAllBytes(filePath);
        return new String(fileByteArray);
    }

    private String basicHtmlEncode(String source) {

        List<String> result = new ArrayList<>();
        String convertedLine = "";

        for(char characterToConvert : source.toCharArray()){
            if(characterToConvert == '\n') {
                result = addANewLine(result, convertedLine);
                convertedLine = "";
            }
            else
                for(CharMatcher charMatcher : charMatchers){
                    convertedLine = charMatcher.matchAndConvert(convertedLine,characterToConvert);
                }
        }

        /*for (char characterToConvert : source.toCharArray()) {
            switch (characterToConvert) {
                case '<':
                    convertedLine += "&lt;";
                    break;
                case '>':
                    convertedLine += "&gt;";
                    break;
                case '&':
                    convertedLine += "&amp;";
                    break;
                case '\n':
                    addANewLine(result,convertedLine);
                    break;
                default:
                    convertedLine += characterToConvert;
            }
        }*/

        result = addANewLine(result,convertedLine);
        return String.join("<br />", result);
    }


    //stringfy convertedLine array and push into result
    //reset convertedLine
    private List<String> addANewLine(List<String> result,String convertedLine) {
        result.add(convertedLine);
        return result;
    }

}
