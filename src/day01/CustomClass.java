package day01;

import java.time.LocalDate;

class Person{

    String name;
    final char gender;
    int age;
    final LocalDate dateOfBirth;

    public Person(String name, char gender, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}



public class CustomClass {
}
