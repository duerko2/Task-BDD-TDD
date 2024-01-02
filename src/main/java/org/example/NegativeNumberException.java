package org.example;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(String negativeNumbers) {
        super("negatives not allowed "+negativeNumbers);
    }


}
