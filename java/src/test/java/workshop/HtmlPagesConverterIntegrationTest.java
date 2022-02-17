package workshop;

import org.junit.Test;
import workshop.MatcherHTML.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HtmlPagesConverterIntegrationTest {
    List<MatcherHTML> matcherHTMLS = new ArrayList<>();


    @Test
    public void convertFromActualFile() throws Exception {
        matcherHTMLS.add(new LessMatcher());
        matcherHTMLS.add(new GtMatcher());
        matcherHTMLS.add(new AmpMatcher());
        matcherHTMLS.add(new NewLineMatcher());
        matcherHTMLS.add(new DefaultMatcher());
        PlaintextToHtmlConverter converter = new PlaintextToHtmlConverter(matcherHTMLS);
        assertEquals("abc<br />&lt;hello&gt;", converter.toHtml());
    }
}
