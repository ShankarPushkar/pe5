package com.stackroute.pe5;

import java.util.Map;

public class MapModify {
    public Map mapModifier(Map input) {
        input.replace("val2",input.get("val1"));
        input.replace("val1"," ");
        return input;
    }
}