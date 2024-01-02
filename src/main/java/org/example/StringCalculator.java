package org.example;

import java.util.Random;

public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        } else return Integer.parseInt(numbers);
    }
}
