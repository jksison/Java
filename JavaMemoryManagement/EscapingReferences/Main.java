public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
				
		// records.getCustomers().clear(); // this should not compile
		
		for (CustomerReadOnly next : records.getCustomers().values())
		{
			System.out.println(next);
		}
		
		// memory test of object's fields. protect the fields
		CustomerReadOnly john = records.getCustomerByName("John");
		System.out.println(john.getName());
		// john.setName("Derek"); // does not change the original list (protected)
							   // but not very intuitive.
		System.out.println(john.getName());
		
		for (CustomerReadOnly next : records.getCustomers().values())
		{
			System.out.println(next);
		}
	}
	
}
