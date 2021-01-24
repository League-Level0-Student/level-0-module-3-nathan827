package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class Yearsalive {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you");
	int Age = Integer.parseInt(age);
	for(int years = 0; years <= Age; years += 1) {
		int Years = 2020 - years;
		System.out.println(Years);
	}
	
	
	
}
}
