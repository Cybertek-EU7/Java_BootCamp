package day01;

import java.time.LocalDate;

class Person{

    static class PersonalInfo{
        static int a = 100;
    }

    String name;
    final char gender;
    int age;
    final LocalDate dateOfBirth;

    static String planet;

    static {
        planet = "Earth";
    }

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

    public static void method(){
      //  System.out.println(name);
     //   System.out.println(age);
        System.out.println(planet);
    }

}


public class CustomClass {

    public static void main(String[] args) {

        Person person1 = new Person("Selim", 'M', 28, LocalDate.of(1994, 3, 14));

        Person person2 = new Person("Bella", 'F', 35, LocalDate.of(1988, 3, 14));

        Person person3 = new Person("Yulia", 'F', 32, LocalDate.of(1990, 3, 14));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


        System.out.println(person1.planet);
        System.out.println(person2.planet);
        System.out.println(person3.planet);

        System.out.println(Person.planet);


        // static Properties property

       int z =  Person.PersonalInfo.a;


    }

}
