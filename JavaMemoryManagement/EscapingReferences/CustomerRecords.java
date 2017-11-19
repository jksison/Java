import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> { 
	// class should implement Iterable<Customer> to protect records	
	
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() { // this is bad. it made records public.
		// return this.records; // bad. should return a copy instead
		// return new HashMap<String, Customer>(records); // copy is counter intuitive
		return Collections.unmodifiableMap(records); // creates a copy and the copy cannot be edited
	}

	@Override
	public Iterator<Customer> iterator() { // better but client can still clear records with clear method
		return this.records.values().iterator();
	}
	
	public CustomerReadOnly getCustomerByName(String name) { // should provide a read only copy 
		// return this.records.get(name); // this is bad. it gives public control
		// return new Customer(this.records.get(name)); // Use interface to restrict setName method
														// Prevents accidental modification
		return this.records.get(name); // CustomerReadOnly can still be cast to Customer
	}
	
}




