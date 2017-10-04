package com.epam.university.assignment.strings;

import com.epam.university.assignment.numbers.NumberGenerator;

public class NumberStringGenerator {

    private NumberGenerator numberGenerator;

    public NumberStringGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public String[] generateString(int numberPairCount,int max){
        String[] result = new String[numberPairCount];
        // 0 tól menjen a ciklus, hogy a nulladik elem a tömbnek ne legyen null és ne kapjunk ArrayIndexOutofBoundsExceptiont
        for(int i=0;i<numberPairCount;i++){
            String element = numberGenerator.generateEven(max)+","+numberGenerator.generateOdd(max);
            result[i]=element;
        }
        return result;
    }

}
