package workshop;

import org.junit.Test;
import workshop.MatcherHTML.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HtmlPagesConverterIntegrationTest {
    @Test
    public void convertFromActualFile() throws Exception {
        List<CharMatcher> charMatchers = null;
        charMatchers.add(new GtSignMatcher());
        charMatchers.add(new LtSignMatcher());
        charMatchers.add(new AmpSignMatcher());
        charMatchers.add(new DefaultMatcher());
        PlaintextToHtmlConverter converter = new PlaintextToHtmlConverter(charMatchers);
        assertEquals("abc<br />&lt;hello&gt;", converter.toHtml());
    }
}