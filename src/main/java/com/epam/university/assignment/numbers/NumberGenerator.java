package com.epam.university.assignment.numbers;

import java.util.Random;

public class NumberGenerator {

    private Random random = new Random();


    public int generateEven(int limit){
        int result = random.nextInt(limit/2)*2;
        return result;
    }

    public int generateOdd(int limit){
        return generateEven(limit)+1;
    }

}
