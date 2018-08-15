package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jim= new Robot ();
	jim.setSpeed(100);
	jim.penDown();
	jim.setPenColor(Color.BLUE);
	for (int i = 0; i < 4; i++) {
		
	
	
		jim.move(100);
		jim.turn(90);
	}
		jim.sparkle();
	
	
	
	
	
	}
}
