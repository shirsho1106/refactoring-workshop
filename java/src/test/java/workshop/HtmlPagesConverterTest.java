package workshop;

import org.junit.Test;
import workshop.MatcherHTML.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HtmlPagesConverterTest {
    List<CharMatcher> charMatchers = new ArrayList<>();

    PlaintextToHtmlConverterFake converter;

    public HtmlPagesConverterTest() {
        charMatchers.add(new GtSignMatcher());
        charMatchers.add(new LtSignMatcher());
        charMatchers.add(new AmpSignMatcher());
        charMatchers.add(new DefaultMatcher());
        converter = new PlaintextToHtmlConverterFake(charMatchers);
    }

    @Test
    public void charConversion() throws Exception {
        converter.setRead("<");
        assertEquals("&lt;", converter.toHtml());

        converter.setRead(">");
        assertEquals("&gt;", converter.toHtml());

        converter.setRead("&");
        assertEquals("&amp;", converter.toHtml());

        converter.setRead("\n");
        assertEquals("<br />", converter.toHtml());
    }

    @Test
    public void noConversion() throws Exception {
        converter.setRead("simple");
        assertEquals("simple", converter.toHtml());
    }

    @Test
    public void mixedCharConversion() throws Exception {
        converter.setRead("<small>\n&space");
        assertEquals("&lt;small&gt;<br />&amp;space", converter.toHtml());
    }

    static class PlaintextToHtmlConverterFake extends PlaintextToHtmlConverter {
        String text;

        public PlaintextToHtmlConverterFake(List<CharMatcher> charMatchers) {
            super(charMatchers);
        }

        @Override
        public String read() throws IOException {
            return text;
        }

        protected void setRead(String text) {
            this.text = text;
        }

    }
}