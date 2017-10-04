package com.epam.university.assignment.numbers;

import java.util.HashSet;
import java.util.Set;

public class NumberUtils {

    public Set<Integer> getDivisors(int number) {
        onlyNonNegativeNumbers(number);
        Set<Integer> result = new HashSet<>();
        int sqrt = (int) Math.sqrt(number);
        // Meg kell engednünk, az egyenlőséget is a feltételben ( i < sqrt) -> ( i <= sqrt )
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                result.add(i);
                result.add(number / i);
            }
        }
        return result;
    }

    public boolean isPrime(int number) {
        onlyNonNegativeNumbers(number);
        return getDivisors(number).size() == 2;
    }

    public String evenOrOdd(int number){
        if(number%2==0){
            return "even";
        }
        return "odd";
    }

    private void onlyNonNegativeNumbers(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("can't process negative number");
        }
    }

}
