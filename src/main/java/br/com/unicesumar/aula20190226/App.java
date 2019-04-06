package br.com.unicesumar.aula20190226;

import br.com.unicesumar.aula20190226.classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] names = {"Ana", "Beatriz", "Jonas", "Bianca"};
        int[] ages = {10, 20, 30, 40};

        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Ana", 10),
                new Person("Beatriz", 20),
                new Person("Jonas", 30),
                new Person("Bianca", 40)));

        System.out.print("Pessoas: ");
        persons.forEach(person -> System.out.print(person.name));
        System.out.println("\nTotal da soma das idades: " + totalAges(persons));
        System.out.println("Maior idade: " + getOlder(persons));
    }

    private static int getOlder(List<Person> persons) {
        try {
            int higherAge = persons.get(0).age;

            for (Person person : persons) {
                higherAge = higherAge < person.age ? person.age : higherAge;
            }

            return higherAge;
        } catch (Exception e) {
            throw new RuntimeException("Error while calculating higher age. Caused by: \n" + e.fillInStackTrace());
        }
    }

    private static int totalAges(List<Person> persons) {
        int total = 0;

        for (Person person : persons) {
            total += person.age;
        }

        return total;
    }
}
