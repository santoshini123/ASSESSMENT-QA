package com.gmail.qa.testcase;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test extends TestCase {

	
	
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public Test( String testName )
	    {
	        super( );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static TestSuite suite()
	    {
	        return new TestSuite( Test.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	        assertTrue( true );
	    }
}
