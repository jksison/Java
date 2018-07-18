package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableImpl implements Comparable<ComparableImpl>{
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public ComparableImpl(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableImpl emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
    	System.out.println("hello");
        return (this.id - emp.id);
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]\n";
    }

       public static void main (String args[]) {
    	
    	//sorting object array
    	ComparableImpl[] empArr = new ComparableImpl[4];
    	empArr[0] = new ComparableImpl(10, "Mikey", 25, 10000);
    	empArr[1] = new ComparableImpl(20, "Arun", 29, 20000);
    	empArr[2] = new ComparableImpl(5, "Lisa", 35, 5000);
    	empArr[3] = new ComparableImpl(1, "Pankaj", 32, 50000);

    	//sorting employees array using Comparable interface implementation
    	Arrays.sort(empArr);
    	System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

    }
}
