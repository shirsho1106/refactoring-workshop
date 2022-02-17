package workshop.MatcherHTML;

import java.util.ArrayList;
import java.util.List;

public class Results {

    List<String> result;
    List<String> convertedLine;

    public Results(List<String> result, List<String> convertedLine) {
        this.result = result;
        this.convertedLine = convertedLine;
    }
    public List<String> getResult() {
        return result;
    }

    public void addResult(String add) {
        this.result.add(add);
    }

    public List<String> getConvertedLine() {
        return convertedLine;
    }

    public void addConvertedLine(String add) {
        this.convertedLine.add(add);
    }

    public void addANewLine() {
        String line = String.join("", getConvertedLine());
        addResult(line);
        convertedLine = new ArrayList<>();
    }
}
