
public class Invoice {

	private int id;
	private Customer customer;
	private double amount;
	
	Customer cus = new Customer(id, name, amount);
	
    Invoice(int id,Customer customer,double amount) {
		id = 0;
		this.customer = customer;
		amount = 0;
	}
	public int getID() {
		return id;
	}
	public Customer getCustomer() {
		return getCustomer();
	}
	public void setCustomer(Customer customer) {
		customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount() {
	     ;
	}
	public int getCustomerID(){
		return id;
	}
	public String getCustomerName() {
		return "";
	}
	public double getCustomerDiscount() {
		return amount;
	}
	public String toString(){
		return "Invoice[id=" + id + ",customer=" + getCustomerName() + "(" + id + ")(" + getCustomerDiscount() +"%" + ",amount=" + amount;
	}
}
