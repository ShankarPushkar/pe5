package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate arrayListUpdate;

    @Before
    public void setUp() {
        arrayListUpdate = new ArrayListUpdate();
    }

    @After
    public void tearDown() {
        arrayListUpdate = null;
    }

    @Test
    public void givenArrayListShouldReturnReplacedArrayList() {
        ArrayList expected = new ArrayList();
        ArrayList userInput = new ArrayList();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");

        userInput.add("Apple");
        userInput.add("Grape");
        userInput.add("Melon");
        userInput.add("Berry");

        ArrayList actualResult = arrayListUpdate.arrayUpdater(userInput, "Apple", "Melon", "Kiwi", "Mango");
        assertEquals(expected, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullArrayListShouldThrowNullPointerException() {
        ArrayList expected = new ArrayList();
        ArrayList userInput = null;
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        ArrayList actualResult = arrayListUpdate.arrayUpdater(userInput, "Apple", "Melon", "Kiwi", "Mango");
        assertEquals(expected, actualResult);
    }
    @Test
    public void givenArrayListShouldReturnEmptyArrayList() {
        ArrayList expected = new ArrayList();
        ArrayList userInput = new ArrayList();

        userInput.add("Apple");
        userInput.add("Grape");
        userInput.add("Melon");
        userInput.add("Berry");

        ArrayList actualResult = arrayListUpdate.arrayDeleter(userInput);
        assertEquals(expected, actualResult);
    }
    @Test(expected = NullPointerException.class)
    public void givenNullArrayListShouldReturnNullPointerException() {
        ArrayList expected = new ArrayList();
        ArrayList userInput = null;
        ArrayList actualResult = arrayListUpdate.arrayDeleter(userInput);
        assertEquals(expected, actualResult);
    }
}