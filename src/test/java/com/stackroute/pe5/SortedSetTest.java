package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet sortedSet;
    @Before
    public void setUp()  {
        sortedSet=new SortedSet();
    }

    @After
    public void tearDown() {
        sortedSet=null;
    }

    @Test
    public void givenAStringArrayShouldReturnSortedArrayList() {
        String[] input={"Harry","Olive","Alice", "Bluto", "Eugene"};
        String[] expected={"Alice", "Bluto", "Eugene", "Harry", "Olive"};
        ArrayList actualResult=sortedSet.setSorter(input);
        ArrayList expectedResult=new ArrayList();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");

        assertEquals(expectedResult,actualResult);
    }
    @Test(expected = NullPointerException.class)
    public void givenANullStringShouldNullPointerException(){
        sortedSet.setSorter(null);
    }
}