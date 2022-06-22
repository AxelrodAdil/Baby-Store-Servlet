package kz.epam.babyStore.tag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class CopyrightTag extends TagSupport {
    private static final Logger logger = LogManager.getLogger();
    private static final String COPYRIGHT_SYMBOL = "© ";

    private String year;
    private String author;

    public void setYear(String year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int doStartTag() throws JspException {
        String copyrightNotice = makeCopyrightNotice();
        try {
            JspWriter out = pageContext.getOut();
            out.write(copyrightNotice);
        } catch (IOException e) {
            logger.error("Unable to write to output stream {}", e.getMessage());
            throw new JspException("Unable to write to output stream", e);
        }
        return SKIP_BODY;
    }

    private String makeCopyrightNotice() {
        return author + " " + COPYRIGHT_SYMBOL + year;
    }
}
