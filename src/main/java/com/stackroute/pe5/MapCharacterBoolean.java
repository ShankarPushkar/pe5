package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapCharacterBoolean {
    public Map mapCharacterCounter(String[] input) {
        int[] count ={0,0,0,0,0};

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "a":
                    count[0]++;
                    break;
                case "b":
                    count[1]++;
                    break;
                case "c":
                    count[2]++;
                    break;
                case "d":
                    count[3]++;
                    break;
            }
        }

        Map sendBack = new HashMap();
        for (int i = 0; i <count.length-1; i++) {
            if(count[i]>1){
                boolean flag=true;
                sendBack.put(input[i],flag);
            }else {
                boolean flag=false;
                sendBack.put(input[i],flag);
            }

        }
        return sendBack;
    }
}
