
public class Rectangle extends shape {

	private double width;
	private double length;
	
	Rectangle(double width,double lenght,String color){
		super(color);
		this.width = width;
		this.length = lenght;
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Retangle[width= " + this.width + ",length" + this.length + "," + super.toString() + "]";
	}
	
	public double getWidth() {
		return this.width;
	}
	public double getLenght() {
		return this.length;
	}
	
}
