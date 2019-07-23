package com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayListUpdate {
    public ArrayList arrayUpdater(ArrayList input,String replace1, String replace2,String replacingWord1,String replacingWord2){
        int indexOfReplace1=input.indexOf(replace1);
        int indexOfReplace2=input.indexOf(replace2);

        input.set(indexOfReplace1,replacingWord1);
        input.set(indexOfReplace2,replacingWord2);
        return input;
    }
    public ArrayList arrayDeleter(ArrayList input){
        input.clear();
        return input;
    }

}
