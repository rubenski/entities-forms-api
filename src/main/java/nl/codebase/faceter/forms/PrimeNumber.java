package nl.codebase.faceter.forms;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PrimeNumber {

    private static final Map<Integer, Integer> PRIME_NUMBERS = new HashMap<>();

    public int findNth(int n) {
        for (int x = 1, potentialPrime = 2; true; potentialPrime++) {
            if(isPrime(potentialPrime)) {
                PRIME_NUMBERS.put(x, potentialPrime);
                if(x == n) {
                    return potentialPrime;
                }
                x++;
            }
        }
    }

    private boolean isPrime(int number) {

        for (int q = 2; q < number; q++) {
            if (number % q == 0) {
                return false;
            }
        }

        return true;
    }
}
