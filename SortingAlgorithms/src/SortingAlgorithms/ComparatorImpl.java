package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorImpl {
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

    public ComparatorImpl(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]\n";
    }

    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<ComparatorImpl> SalaryComparator = new Comparator<ComparatorImpl>() {

        @Override
        public int compare(ComparatorImpl e1, ComparatorImpl e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<ComparatorImpl> AgeComparator = new Comparator<ComparatorImpl>() {

        @Override
        public int compare(ComparatorImpl e1, ComparatorImpl e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<ComparatorImpl> NameComparator = new Comparator<ComparatorImpl>() {

        @Override
        public int compare(ComparatorImpl e1, ComparatorImpl e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    
    public static void main (String args[]) {
    	
    	//sorting object array
    	ComparatorImpl[] empArr = new ComparatorImpl[4];
    	empArr[0] = new ComparatorImpl(10, "Mikey", 25, 10000);
    	empArr[1] = new ComparatorImpl(20, "Arun", 29, 20000);
    	empArr[2] = new ComparatorImpl(5, "Lisa", 35, 5000);
    	empArr[3] = new ComparatorImpl(1, "Pankaj", 32, 50000);
    	
    	//sort employees array using Comparator by Salary
    	Arrays.sort(empArr, ComparatorImpl.SalaryComparator);
    	System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

    	//sort employees array using Comparator by Age
    	Arrays.sort(empArr, ComparatorImpl.AgeComparator);
    	System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

    	//sort employees array using Comparator by Name
    	Arrays.sort(empArr, ComparatorImpl.NameComparator);
    	System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
    }
}
