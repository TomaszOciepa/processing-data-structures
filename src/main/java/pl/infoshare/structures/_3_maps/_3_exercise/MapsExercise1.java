package main.java.pl.infoshare.structures._3_maps._3_exercise;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise1 {

    // TODO: Ćwiczenie 3 - Map API
    // TODO: 1. Utwórz nową HashMapę nazwę miasta od Integer (liczba mieszkańców)
    // TODO: 2. Dodaj do mapy trzy trójmiejskie miasta wraz z liczba ich mieszkancow
    // TODO: 3. Zaktualizuj liczbę mieszkańców Gdyni do 150
    // TODO: 4. Zaktualizuj liczbę mieszkańców Wejherowa do 36000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 5. Zaktualizuj liczbę mieszkańców Gdańska do 100000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 6. Wypisz na ekran tylko miasta
    // TODO: 7. Wypisz na ekran tylko ilość mieszkańców
    // TODO: 8. Wypisz na ekran dane dla Gdańska, Wejherowa i Warszawy. Jeżeli miasta nie ma wypisz zero.
    public static void main(String[] args) {

        Map<String, Integer> cityPopulation = new HashMap<>(); // 1

        cityPopulation.put("Gdańsk", 400000); //2
        cityPopulation.put("Gdynia", 300000); //2
        cityPopulation.put("Sopot", 200000); //2

        cityPopulation.put("Gdynia", 150); //3

        System.out.println("get "+cityPopulation.get("Gdynia")); //3

        cityPopulation.putIfAbsent("Wejcherowo", 36000); //4
        System.out.println("get "+cityPopulation.get("Wejcherowo")); //4

        cityPopulation.putIfAbsent("Gdańsk", 100000); //5
        System.out.println("get "+cityPopulation.get("Gdańsk")); //5

        System.out.println("keySet "+cityPopulation.keySet()); //6
        System.out.println("values "+cityPopulation.values()); //7

        System.out.println("getOrDefault "+ cityPopulation.getOrDefault("Gdańsk", 0));
        System.out.println("getOrDefault "+ cityPopulation.getOrDefault("Wejcherowo", 0));
        System.out.println("getOrDefault "+ cityPopulation.getOrDefault("Warszawa", 0));



    }
}
