package ocjp;
import java.util.Set;
import java.util.TreeSet;
 
class Employee1 implements Comparable<Employee1> {
    private String name;
    private int age;
 
    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }
 
    @Override
    public int compareTo(Employee1 o) {
        return o.age - this.age;
    }
}
 
public class Employee {
    public static void main(String[] args) {
        Set<Employee1> employees = new TreeSet<>();
        employees.add(new Employee1("Udayan", 31));
        employees.add(new Employee1("Neha", 23));
        employees.add(new Employee1("Hou Jian", 42));
        employees.add(new Employee1("Smita", 29));
 
        System.out.println(employees);
    }
}

/*
 * Comparable interface has compareTo(...) method and Comparator interface has
 * compare(...) method.
 * 
 * In this case, class Employee correctly implements Comparable interface.
 * 
 * 
 * 
 * return o.age - this.age; => This will help to sort the Employee objects in
 * descending order of age and not in ascending order.
 * 
 * 
 * 
 * As no Comparator is passed in TreeSet, hence it sorts on the basis of
 * implementation of Comparable interface, which means Employee objects will be
 * sorted in descending order of their age.
 */