package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MapModifyTest {
    MapModify mapModify;

    @Before
    public void setUp() {
        mapModify = new MapModify();
    }

    @After
    public void tearDown() {
        mapModify = null;
    }

    @Test
    public void givenAMapShouldReplaceElementsAndReturnReplacedMap() {
        Map input = new HashMap();
        input.put("val1", "java");
        input.put("val2", "C++");
        Map actualResult = mapModify.mapModifier(input);
        Map expectedResult = new HashMap();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", "java");
        assertEquals(expectedResult,actualResult);
    }
    @Test(expected = NullPointerException.class)
    public void givenANullMapShouldThrowException() {
        Map actualResult = mapModify.mapModifier(null);
        assertNotNull(actualResult);
    }
}