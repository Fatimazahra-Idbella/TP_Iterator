package com.exemple.projet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.TestCase;

public class TestPersonWithIteratorTest extends TestCase {

    public void testRemovePersonByName() {

        Set<Person> people = new HashSet<>();
        people.add(new Person(1, " Alice "));
        people.add(new Person(2, " Bob "));
        people.add(new Person(3, " Charlie "));

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals(" Bob ")) {
                iterator.remove();
            }
        }

        assertEquals(2, people.size());
        assertFalse(people.contains(new Person(2, " Bob ")));
        assertTrue(people.contains(new Person(1, " Alice ")));
        assertTrue(people.contains(new Person(3, " Charlie ")));
    }

    public void testInitialSetContents() {

        Set<Person> people = new HashSet<>();
        people.add(new Person(1, " Alice "));
        people.add(new Person(2, " Bob "));
        people.add(new Person(3, " Charlie "));

        assertEquals(3, people.size());
        assertTrue(people.contains(new Person(1, " Alice ")));
        assertTrue(people.contains(new Person(2, " Bob ")));
        assertTrue(people.contains(new Person(3, " Charlie ")));
    }
}
