package generic.application;

import generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Komeng", "Caringin"),
                new Person("Catur", "Taman Safari"),
                new Person("Samsul", "Gadog")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
