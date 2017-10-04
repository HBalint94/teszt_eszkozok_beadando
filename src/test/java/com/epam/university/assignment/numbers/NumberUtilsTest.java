package com.epam.university.assignment.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

// Mock is not needed now
// onlyNonNegativeNumbers is private so I won't test it.
public class NumberUtilsTest {

    private NumberUtils numberUtils;

    @Before
    public void setup(){
        numberUtils = new NumberUtils();
    }

    // getDivisorsTests start*********

    @Test
    public void testGetDivisorsWithOneParameterValue(){
        Set<Integer> result = numberUtils.getDivisors(1);
        assertTrue(result.contains(1) && result.size() == 1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetDivisorsWithNegativeParameter(){
        Set<Integer> result = numberUtils.getDivisors(-10);
    }
    @Test
    public void testGetDivisorsWithNegativeParameterImproved(){
        try{
            numberUtils.getDivisors(-10);
            fail("no exception is thrown");
        } catch (Exception exc){
            assertThat(exc, instanceOf(IllegalArgumentException.class));
            assertThat(exc.getMessage(),containsString("can't process negative number"));
        }
    }
    @Test
    public void testGetDivisorsWithValidParameter(){
        Set<Integer> result = numberUtils.getDivisors(15);
        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(1);
        expectedSet.add(3);
        expectedSet.add(5);
        expectedSet.add(15);
        assertThat(result,equalTo(expectedSet));
    }

    // getDivisorsTests end *********


    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeWithNegativeValue(){
      boolean b = numberUtils.isPrime(-10);
    }
    @Test
    public void testIsPrimeWithPositiveValue(){
        assertTrue(numberUtils.isPrime(7));
        assertFalse(numberUtils.isPrime(6));
    }



    @Test
    public void testEvenorOdd(){
        String result = numberUtils.evenOrOdd(-10);
        assertEquals(result,"even");
        String result2 = numberUtils.evenOrOdd(15);
        assertEquals(result2,"odd");
    }

}