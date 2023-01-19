package customer;

public class CustomerRunner {

	public static void main(String[] args) {
		Customer customer = new Customer("jun", new Address("a-line", "suncheon", "1"));
		
		Address workAddress = new Address("a-line-work", "suncheon", "1");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
		

	}

}
