package ocjp;

	 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book {
   String title;
   String author;
   double price;
   
   public Book(String title, String author, double price) {
       this.title = title;
       this.author = author;
       this.price = price;
   }
   
   public String getAuthor() {
       return this.author;
   }
   
   public String toString() {
       return "{" + title + "," + author + "," + price + "}";
   }
}
   
public class Test3 {
   public static void main(String[] args) {
       List<Book> books = Arrays.asList(
               new Book ("Head First Java", "Kathy Sierra", 24.5),
               new Book ("OCP", "Udayan Khattry", 20.99),
               new Book ("OCA", "Udayan Khattry", 14.99));
       books.stream().collect(Collectors.groupingBy(Book::getAuthor))
               .forEach((a,b) -> System.out.println(a));
   }
}

/*
 * books --> [{Head First Java,Kathy Sierra,24.5}, {OCP,Udayan Khattry,20.99},
 * {OCA,Udayan Khattry,14.99}]. Ordered by insertion order.
 * 
 * 
 * 
 * books.stream() returns Stream<Book> type: [{Head First Java,Kathy
 * Sierra,24.5}, {OCP,Udayan Khattry,20.99}, {OCA,Udayan Khattry,14.99}].
 * 
 * 
 * 
 * books.stream().collect(Collectors.groupingBy(Book::getAuthor)) returns a
 * Map<String, List<Book>> type, key is the author name and value is the List of
 * book objects.
 * 
 * 
 * 
 * map --> [{Kathy Sierra, {Head First Java,Kathy Sierra,24.5}}, {Udayan
 * Khattry, {{OCP,Udayan Khattry,20.99}, {OCA,Udayan Khattry,14.99}}}].
 * 
 * 
 * 
 * forEach method accepts a BiConsumer<String, List<Book>> , so first parameter
 * of accept method is key and 2nd parameter is value. So in the given lambda
 * expression 'a' is key and 'b' is value.
 * 
 * 
 * 
 * System.out.println(a) prints keys(author names) to the console.
 * 
 */