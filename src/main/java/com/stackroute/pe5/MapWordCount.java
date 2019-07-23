package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapWordCount {
    public Map mapWordCounter(String input) {
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;

        input = input.replaceAll("\\*|\\?|@|-|___|,", " ");
        input = input.replaceAll("  ", " ");
        String[] arrayInput = input.split(" ");
        for (int i = 0; i < arrayInput.length; i++) {
            switch (arrayInput[i]) {
                case "one":
                    countOne++;
                    break;
                case "two":
                    countTwo++;
                    break;
                case "three":
                    countThree++;
                    break;
            }
        }

        Map sendBack = new HashMap();
        sendBack.put("one", countOne);
        sendBack.put("two", countTwo);
        sendBack.put("three", countThree);
        return sendBack;
    }
}
