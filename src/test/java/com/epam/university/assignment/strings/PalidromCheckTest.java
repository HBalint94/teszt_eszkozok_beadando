package com.epam.university.assignment.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalidromCheckTest {

    private PalidromCheck palidromCheck;

    @Before
    public void setup(){
        palidromCheck = new PalidromCheck();
    }
    @Test
    public void testIsPalidromWithEmptyString(){
        assertTrue(palidromCheck.isPalindrom(""));
    }
    @Test
    public void testIsPalidromWithNotEmptyString(){
        assertTrue(palidromCheck.isPalindrom("gezakekazeg"));
        assertFalse(palidromCheck.isPalindrom("gezanemkekazeg"));
    }

}