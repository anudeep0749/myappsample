package ocjp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person1 {
   private String firstName;
   private String lastName;

   public Person1(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }

   public String getFirstName() {
       return firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public String toString() {
       return "{" + firstName + ", " + lastName + "}";
   }
}

public class Person {
   public static void main(String[] args) {
       List<Person1> list = Arrays.asList(
               new Person1("Tom", "Riddle"),
               new Person1("Tom", "Hanks"),
               new Person1("Yusuf", "Pathan"));
       list.stream().sorted(Comparator.comparing(Person1::getFirstName).reversed()
               .thenComparing(Person1::getLastName)).forEach(System.out::println);
   }
}
