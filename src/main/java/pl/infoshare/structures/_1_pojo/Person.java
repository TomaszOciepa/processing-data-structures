package main.java.pl.infoshare.structures._1_pojo;

public class Person {

    String name;
    String surname;
    String City;
    int age;


    public Person(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        City = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return City;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", City='" + City + '\'' +
                ", age=" + age +
                '}';
    }
}
