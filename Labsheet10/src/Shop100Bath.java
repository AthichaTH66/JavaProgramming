import javax.swing.*;
public class Shop100Bath {

	public static void main(String[] args) {
		
        Product sold = new Product();
        
        int buttonComfirm = JOptionPane.showConfirmDialog(null, "Patthanakarn?");
        if(buttonComfirm == 0) {
        	sold = new PatthanakarnBranch();
        }
        
        int numberOfProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product; "));
        sold.setUnit(numberOfProduct);
		
        JOptionPane.showMessageDialog(null, sold.toString());
	}

}
