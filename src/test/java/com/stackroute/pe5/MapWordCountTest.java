package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapWordCountTest {
    private MapWordCount mapWordCount;

    @Before
    public void setUp() {
        mapWordCount=new MapWordCount();
    }

    @After
    public void tearDown() {
        mapWordCount=null;
    }

    @Test
    public void givenAStringShouldReturnWordAndOccurenceInKey(){
        String input="one one -one___two,,three,one @three*one?two";
        Map actualResult=mapWordCount.mapWordCounter(input);
        Map expectedResult=new HashMap();
        expectedResult.put("one",5);
        expectedResult.put("two",2);
        expectedResult.put("three",2);
        assertEquals(expectedResult,actualResult);
    }
    @Test(expected = NullPointerException.class)
    public void givenAStringShouldNullPointerException(){
        mapWordCount.mapWordCounter(null);
    }
}