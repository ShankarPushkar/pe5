package com.stackroute.pe5;

import java.util.*;

public class SortedSet {
    public ArrayList setSorter(String[] input) {
        Set inputSet = new TreeSet();
        ArrayList sendBack = new ArrayList();
        for (int i = 0; i < input.length; i++) {
            inputSet.add(input[i]);
        }
        Iterator iterator = inputSet.iterator();
        while (iterator.hasNext()) {
            sendBack.add(iterator.next());
        }


        return sendBack;
    }
}
