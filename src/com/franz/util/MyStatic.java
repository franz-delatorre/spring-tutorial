package com.franz.util;

import com.franz.components.KeyValue;
import com.franz.components.Person;

import java.util.Map;

public class MyStatic {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printKeyValue(KeyValue kv) {
        Map<String, Person> k = kv.getMyMap();
        k.forEach((key, value) -> System.out.println(value.getFirstName()));
    }
}
