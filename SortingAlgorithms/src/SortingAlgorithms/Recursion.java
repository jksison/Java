package SortingAlgorithms;

public class Recursion {

	public static int factorial(int n) {
		if (n <= 1) return 1;
		else return n * factorial(n - 1);		
	}
	
	public static int factorialVisualization(int n) {
		System.out.println("Computing factorial of " + n + ".");
		if (n <= 1) {
			System.out.println("Result of factorial " + n + " = 1");
			return 1;
		}
		else {
			int result = factorialVisualization(n - 1);
			System.out.println("Result of factorial " + n + " = " + (n * result));
			return n * result;
		}
	}
	
	public static void main(String[] args) {
		factorialVisualization(4);
	}
}
