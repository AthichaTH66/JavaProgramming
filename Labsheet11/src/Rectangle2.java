
public class Rectangle2 implements shape2{
	
	private double width,length;
	
	Rectangle2(double width,double length){
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return 0;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLenght() {
		return this.length;
	}
	public String toString() {
		return "Retangle[width= " + this.width + ",length" + this.length + "," + super.toString() + "]";
	}
	

}
