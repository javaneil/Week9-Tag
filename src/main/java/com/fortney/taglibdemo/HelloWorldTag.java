package com.fortney.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Neil on 3/21/2017.
 */
public class HelloWorldTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag() ;
        JspWriter out = getJspContext().getOut() ;
        out.println( "<h2>Hello From Week-9 custom Tag</h2>" ) ;
        out.println( "<br />" + checkDate( LocalDate.of( 2017, 05, 15 ) ) ) ; // MATC Spring 2017
    }

    /**
     * checkDate
     *
     * @param endOfSemester - LocalDate for the last day of the semester.
     * @return - String, either remaining days, or date has passed messages.
     */
    public String checkDate( LocalDate endOfSemester ) {
        String retStr ;
        LocalDate today = LocalDate.now() ;

        long days = ChronoUnit.DAYS.between( today, endOfSemester ) ;
        if ( 0 < days ) {
            retStr = days + " days until the end of the semester" ;
        }
        else {
            retStr = "Semester's over!" ;
        }
        return retStr ;
    }
}
