package guiBasics;

import java.util.Locale;

import javax.swing.JOptionPane;

public class GUIBasics {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		JOptionPane.showMessageDialog(null, "Hello " + name + "\nYou are " + age + " years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
		JOptionPane.showMessageDialog(null,
				"Hello " + name + "\nYou are " + age + " years old\nYour height is " + height + " meters");

	}

}
