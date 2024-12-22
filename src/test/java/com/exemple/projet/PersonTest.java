package com.exemple.projet;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testEqualsAndHashCode() {

        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(1, "Alice");
        Person person3 = new Person(2, "Bob");

        assertEquals(person1, person2);

        assertEquals(person1.hashCode(), person2.hashCode());

        assertNotSame(person1, person3);
    }

    public void testToString() {

        Person person = new Person(1, "Alice");
        String expected = "Person{id=1, name='Alice'}";

        assertEquals(expected, person.toString());
    }
}
