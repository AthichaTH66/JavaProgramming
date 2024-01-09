
public class TestCircle {

	public static void main(String[] args) {
		// declare two object reference from Class Circle
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		c1.setRadius(2.0);
		c1.setColor("Blue");
		System.out.print("Ciecle 1 area "+ c1.getArea());
		System.out.println(", and color is "+ c1.getColor());
		
		c2.setRadius(2.0);
		c2.setColor("Red");
		System.out.print("Ciecle 2 area "+ c1.getArea());
		System.out.println(", and color is "+ c1.getColor());
		
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.println("Ciecle 2 area "+ c1.getArea());
		
	}
	public static String showColor(String color) {
		return "The color is "+color;
	}

}
