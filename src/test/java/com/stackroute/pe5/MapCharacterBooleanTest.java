package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapCharacterBooleanTest {
    MapCharacterBoolean mapCharacterBoolean;
    @Before
    public void setUp(){
        mapCharacterBoolean=new MapCharacterBoolean();
    }

    @After
    public void tearDown(){
        mapCharacterBoolean=null;
    }

    @Test
    public void givenStringArrayShouldReturnCharacterAndBoolean() {
        String input[]={"a","b","c","d","a","c","c"};
        Map actualResult=mapCharacterBoolean.mapCharacterCounter(input);
        Map expectedResult=new HashMap();
        expectedResult.put("a",true);
        expectedResult.put("b",false);
        expectedResult.put("c",true);
        expectedResult.put("d",false);
        assertEquals(expectedResult,actualResult);
    }
    @Test(expected = NullPointerException.class)
    public void givenAStringShouldNullPointerException(){
        mapCharacterBoolean.mapCharacterCounter(null);
    }
}