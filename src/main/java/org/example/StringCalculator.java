package org.example;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.KeyPair;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String numbers) throws NegativeNumberException {
        if(numbers.isEmpty()){
            return 0;
        }
        SimpleEntry<String, String> delimiterPair = findDelimiter(numbers);
        String delimiter = delimiterPair.getKey();
        numbers = delimiterPair.getValue();
        numbers = numbers.replaceAll("\\n",delimiter);
        String[] numberSplit = numbers.split(delimiter);

        int retVal = 0;
        ArrayList<Integer> negatives = new ArrayList();
        for (int i = 0; i < numberSplit.length; i++) {
            int addVal = Integer.parseInt(numberSplit[i]);
            retVal += addVal;

            if(addVal < 0){
                negatives.add(addVal);
            }

        }
        if(!negatives.isEmpty()){
            throw new NegativeNumberException(negatives.toString());
        }

        return retVal;
    }

    private SimpleEntry<String,String> findDelimiter(String numbers){
        if(numbers.contains("//")){
            int newLineindx = numbers.indexOf("\n");
            String retVal = numbers.substring(2,newLineindx);
            String newString = numbers.substring(newLineindx+1);
            return new SimpleEntry(retVal,newString);
        }

        return new SimpleEntry(",",numbers);

    }
}

