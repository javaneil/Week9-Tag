package com.fortney.taglibdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

/**
 * Created by Neil on 3/22/2017.
 */
public class HelloWorldTagTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

/*
    @Test
    public void doTag() throws Exception {
        HelloWorldTag test = new HelloWorldTag() ;
        test.doTag() ;
    }
*/

    @Test
    public void beforeDate() throws Exception {
        HelloWorldTag test = new HelloWorldTag() ;
        assertEquals( "33 days until the end of the semester",
                test.checkDate( LocalDate.now().plus( 33, ChronoUnit.DAYS ) ) ) ;
    }

    @Test
    public void afterDate() throws Exception {
        HelloWorldTag test = new HelloWorldTag() ;
        assertEquals( "Semester's over!",
                test.checkDate( LocalDate.now().minus( 1, ChronoUnit.DAYS ) ) ) ;

    }

}