package workshop.MatcherHTML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {

    List<MatcherHTML> matcherHTMLS;

    public PlaintextToHtmlConverter(List<MatcherHTML> matcherHTMLS) {
        this.matcherHTMLS = matcherHTMLS;
    }

    public String toHtml() throws Exception {
        String text = read();
        return basicHtmlEncode(text);
    }

    protected String read() throws IOException {
        Path file = Paths.get("sample.txt");
        byte[] fileBytes = Files.readAllBytes(file);
        return new String(fileBytes);
    }

    private String basicHtmlEncode(String source) {
        List<String> result = new ArrayList<>();
        List<String> convertedLine = new ArrayList<>();

        Results results = new Results(result, convertedLine);

        for (char characterToConvert : source.toCharArray()) {
            for (MatcherHTML matcherHTML : this.matcherHTMLS) {
                if (matcherHTML.matches(characterToConvert)) {
                    results = matcherHTML.getResponse(results);
                }
            }
        }

        result = results.getResult();
        convertedLine = results.getConvertedLine();

        return String.join("<br />", result);
    }
}
