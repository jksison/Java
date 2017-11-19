
public class Customer  {
	private String name;

	public String getName() {
		return name;
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name; 
	}
	
	
	public String toString() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void finalize() {
		System.out.println("This object is being gc'ed.");
		
		// useless method, usually used in cleaning up/close the object
		/*
		 * if (file.isOpen())
		 * {
		 * 		logger.warn("It looks like this resource was not closed.");
		 * }
		 */
		
	}
	
}
