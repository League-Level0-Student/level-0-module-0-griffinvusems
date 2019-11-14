package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, input +" is also my favorite color!!");
	 Robot space = new Robot("mini");
	 space.hide();
	 space.penDown();
	 space.move(100);
	 space.turn(-120);
	 space.move(100);
	 space.turn(-120);
	 space.move(100);
	 
}
}
