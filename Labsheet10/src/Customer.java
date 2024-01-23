
public class Customer {
private int id;
private String name;
private int discount;

Customer(int id,Customer customer,double amount) {
	this.id = id;
	this.name = name;
	discount = discount;
}
public int getID() {
	return id;
}
public String getName(String name) {
	return name;
}
public int getDiscount() {
    return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public String toString() {
	return "name" + "(" + id + ")" + "(" + discount + ")";
}
}
