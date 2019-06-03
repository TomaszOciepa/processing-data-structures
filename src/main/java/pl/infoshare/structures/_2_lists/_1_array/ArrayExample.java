package main.java.pl.infoshare.structures._2_lists._1_array;

import main.java.pl.infoshare.structures._1_pojo.Person;

public class ArrayExample {

    // TODO: Utwórz tablicę zawierającą 3 różne osoby
    // TODO: Wypisz na ekran drugi element tablicy
    // TODO: Dodaj czwartą osobę do tablicy
    // TODO: Wypisz czwartą osobę na ekran
    // TODO: Dodaj 2 kolejne osoby do tablicy
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Tomek","Ociepa", "Gdańsk", 29);
        persons[1] = new Person("Klaudia","Quirini", "Gdańsk", 24);
        persons[2] = new Person("Zinedine","Zidane", "Madryt", 46);

        System.out.println(persons[1]);
    }
}