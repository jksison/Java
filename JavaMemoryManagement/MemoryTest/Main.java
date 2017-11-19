
public class Main {

	public static void main(String args[]) {
		Main main = new Main(); // main in the stack, new Main() in the heap
		main.start();
	}
	
	public void start() {
		String last = "Z"; // last in the stack, "Z" in the heap
		Container container = new Container(); // container in the stack, new Container() in the heap
		container.setInitial("C"); // "A" lost in the heap, 
								   //initial in the heap points to "C" in the heap
		another(container,last); // initial becomes "B", last still "Z"
		System.out.print(container.getInitial()); // "B"
	}
	
	public void another(Container initialHolder, String newInitial) { 
		// initialHolder in the stack, newInitial in the stack
		newInitial.toLowerCase(); // creates "z" in the heap
		initialHolder.setInitial("B"); // "C" lost in the heap
									   // initial in the heap points to "B" in the heap
		Container initial2 = new Container(); // initial2 in the stack, new Container() in the heap
		initialHolder=initial2; // initialHolder in the stack points to 
								// initial2's value in the heap, new Container()
		System.out.print(initialHolder.getInitial()); // "A"
		System.out.print(newInitial); // "Z"
	}
}
