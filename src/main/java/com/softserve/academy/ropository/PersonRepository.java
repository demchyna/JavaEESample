package com.softserve.academy.ropository;

import com.softserve.academy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private static List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public Person getPersonById(int id) {
        return people.stream().filter((p) -> p.getId() == id).findFirst().orElse(null);
    }


    public void updatePerson(Person person) {
        int index = people.indexOf(people.stream().filter((p) -> p.getId() == person.getId()).findFirst().orElse(null));

        if (person != null) {
            people.set(index, person);
        }
    }

    public void deletePerson(int id) {
        Person person = people.stream().filter((p) -> p.getId() == id).findFirst().orElse(null);

        if (person != null) {
            people.remove(person);
        }
    }

    public List<Person> getAllPeople() {
        return people;
    }

}
