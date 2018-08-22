package section3;

import javax.swing.JOptionPane;

public class Hello {
public static void main(String[] args) {
	
	String input=JOptionPane.showInputDialog("Name?");
	JOptionPane.showMessageDialog(null, "Hello"+input);
	if(input.equals("dave")) {
		JOptionPane.showMessageDialog(null,"nice Name");
	}else {
		JOptionPane.showMessageDialog(null, "cool");
	}
}
}
