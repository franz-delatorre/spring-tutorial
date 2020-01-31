package com.franz.components;

import java.util.Map;

public class KeyValue {
    private Map<String, Person> myMap;

    public KeyValue(Map<String, Person> myMap) {
        this.myMap = myMap;
    }

    public Map<String, Person> getMyMap() {
        return myMap;
    }
}
