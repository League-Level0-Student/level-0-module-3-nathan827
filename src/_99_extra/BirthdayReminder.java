
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 20th";
		String dadsBirthday = "October 20th";
		String myBirthday = "August 27th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("What birthday do you want to know?(mom dad, or Nathan)");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		else if(birthday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else if(birthday.equals("Nathan")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}

	} 
}
