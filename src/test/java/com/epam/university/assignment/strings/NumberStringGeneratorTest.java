package com.epam.university.assignment.strings;

import com.epam.university.assignment.numbers.NumberGenerator;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// We have to use mock because this class behaviour depends on NumberGenerator class.
public class NumberStringGeneratorTest {

    private NumberStringGenerator numberStringGenerator;
    private NumberGenerator numberGeneratorMock;

    @Before
    public void setup(){
        numberGeneratorMock = mock(NumberGenerator.class);
        numberStringGenerator = new NumberStringGenerator(numberGeneratorMock);
    }
    @Test
    public void testGenerateStringWithZeroParameters(){
        //Given
        when(numberGeneratorMock.generateEven(0)).thenReturn(0);
        when(numberGeneratorMock.generateOdd(0)).thenReturn(1);

        String[] expectedArray = new String[0];
        //When
        String[] result = numberStringGenerator.generateString(0,0);
        //Then
        assertThat(result,equalTo(expectedArray));

    }
    @Test
    public void testGenerateStringWithNotZeroParameters(){
        //Given
        when(numberGeneratorMock.generateEven(5)).thenReturn(4);
        when(numberGeneratorMock.generateOdd(5)).thenReturn(3);

        String[] expectedArray = new String[2];
        expectedArray[0] = "4,3";
        expectedArray[1] = "4,3";
        //When
        String[] result = numberStringGenerator.generateString(2,5);
        //Then
        assertThat(result,equalTo(expectedArray));
    }
}