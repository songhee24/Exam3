package com.company.exam2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Exam2 {

    public static void main(String[] args) throws Exception {
         LinkedList<Person> people = new LinkedList<>();
           Person person = new Person("a","b","c");
           Person person1 = new Person("a","b","c");
           people.add(person);
           people.add(person1);
           for (Person l: people){
               if (l.equals(person)){
                   throw new Exception();
               }
           }
           System.out.println(people);
    }

}
class Person {
   private String lastName;
   private String firstName;
   private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, patronymic);
    }
}
