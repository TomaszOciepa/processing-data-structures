package main.java.pl.infoshare.structures._2_lists._2_exercise;

import main.java.pl.infoshare.structures._1_pojo.Person;

import java.util.LinkedList;
import java.util.List;

public class ListExercise1 {

    // TODO: Ćwiczenie 1 - API list
    // TODO: 1. Utwórz nową ArrayList przechowującą typy Person
    // TODO: 2. Utwórz cztery instancje klasy Person, dodaj je do listy
    // TODO: 3. Wypisz na ekran drugi element
    // TODO: 4. Usuń trzeci element z listy
    // TODO: 5. Sprawdź rozmiar
    // TODO: 6. Wypisz wszystkie pełnoletnie osoby
    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();

        Person firstPerson = new Person("Tomek", "Ociepa", "Gdańsk", 29);
        Person secoundPerson = new Person("Klaudia", "Quirini", "Gdańsk", 24);
        Person thirdPerson = new Person("Zinedine", "Zidane", "Madryt", 46);
        Person fourPerson = new Person("Przem", "Sadkowski", "Gdynia", 33);

        personList.add(firstPerson);
        personList.add(secoundPerson);
        personList.add(thirdPerson);
        personList.add(fourPerson);

        System.out.println(personList.get(1));
        personList.remove(2);
        System.out.println("rozmiar listy:"+personList.size());

        System.out.println("Pełnoletnie osoby:");
        for (int i = 0; i < personList.size(); i++) {

            if (personList.get(i).getAge() >= 18){
                System.out.println(personList.get(i));
            }
        }


    }
}
