package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapWordCountTest {
    MapWordCount mapWordCount;

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
        expectedResult.put(5,"one");
        expectedResult.put(2,"two");
        expectedResult.put(2,"three");
        assertEquals(actualResult,expectedResult);
    }
}