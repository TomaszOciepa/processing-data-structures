package main.java.pl.infoshare.structures._1_pojo;

public class PojoExercise {

    // TODO: Zadanie Rozgrzewkowe
    // TODO: Zamodeluj klasę reprezentującą osobę. Klasa powinna zawierać tylko podstawowe dane osobowe.
    // TODO: Utwórz instancję klasy i wypisz informacje o osobie na ekran.
    public static void main(String[] args) {

        Person person = new Person("Tomek", "Ociepa", "Gdansk", 29);


        System.out.println(person.toString());

    }
}
