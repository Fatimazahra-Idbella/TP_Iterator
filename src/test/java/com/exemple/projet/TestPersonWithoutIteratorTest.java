
package com.exemple.projet;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

public class TestPersonWithoutIteratorTest extends TestCase {

    public void testRemovePersonByName() {

        // Initialisation de l'ensemble
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, " Alice "));
        people.add(new Person(2, " Bob "));
        people.add(new Person(3, " Charlie "));

        // Création d'une collection temporaire pour stocker les éléments à supprimer
        Set<Person> toRemove = new HashSet<>();
        for (Person person : people) {
            if (person.getName().equals(" Bob ")) {
                toRemove.add(person);
            }
        }

        // Suppression des éléments depuis l'ensemble principal
        people.removeAll(toRemove);

        // Vérifications
        assertEquals(2, people.size());
        assertFalse(people.contains(new Person(2, " Bob ")));
        assertTrue(people.contains(new Person(1, " Alice ")));
        assertTrue(people.contains(new Person(3, " Charlie ")));
    }

    public void testInitialSetContents() {

        // Initialisation de l'ensemble
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, " Alice "));
        people.add(new Person(2, " Bob "));
        people.add(new Person(3, " Charlie "));

        // Vérifications des données initiales
        assertEquals(3, people.size());
        assertTrue(people.contains(new Person(1, " Alice ")));
        assertTrue(people.contains(new Person(2, " Bob ")));
        assertTrue(people.contains(new Person(3, " Charlie ")));
    }
}
