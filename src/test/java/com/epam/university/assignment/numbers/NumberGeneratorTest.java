package com.epam.university.assignment.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGeneratorTest {


    private NumberGenerator numberGenerator;

    @Before
    public void setup(){
        numberGenerator = new NumberGenerator();
    }
    @Test
    public void testGenerateEven(){
        //Given
        //When
        int result =  numberGenerator.generateEven(10);
        //Then
        assertTrue((result % 2) == 0);
        //and also we can check the limit, but it's not important
        assertTrue(result<=10);
    }
    @Test
    public void testGenerateOdd(){
        //Given
        //When
        int result = numberGenerator.generateOdd(10);
        //Then
        assertFalse((result % 2) == 0);
        //and also we can check the limit, but it's not important
        assertTrue(result<=9);
    }

}