package com.franz.components;

import com.franz.components.Person;

import java.util.List;

public class PersonsList {
    private List<Person> personList;

    public PersonsList(List<Person> personList) {
        this.personList = personList;
    }

    public void printPersonList() {
        personList.forEach( p -> {
            String x = p.getFirstName();
            System.out.println(x);
        });
    }
}
