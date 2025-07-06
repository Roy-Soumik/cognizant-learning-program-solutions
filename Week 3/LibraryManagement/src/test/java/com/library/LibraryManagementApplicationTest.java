package com.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LibraryManagementApplicationTest
    extends TestCase
{
    public LibraryManagementApplicationTest(String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( LibraryManagementApplicationTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
