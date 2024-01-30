import javax.swing.*;
public class RectangleDemo {

	public static void main(String[] args) {
		
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));

		String colorInput =  JOptionPane.showInputDialog("Input color");
		
		
		//send 3-argument to Constructor
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		//show the width length and color 
		JOptionPane.showMessageDialog(null,obj1+"\nArea of rectangle = " + obj1.getArea());*/
		
        double widthInput  = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null,obj2.toString()+"\nArea of rectangle = " + obj2.getArea());
		
		
	}

}
