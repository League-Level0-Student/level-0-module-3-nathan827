
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setX(0);
rob.setSpeed(10);
rob.turn(90);
rob.move(50);
		// 2. Make the robot draw a star shape. Hint: angle=144.
for(int distance = 0;distance <10; distance += 1) {
	rob.penDown();
for(int count = 0; count < 5; count += 1) {
rob.turn(144);
rob.move(30);
}
rob.penUp();
rob.move(50);
}

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
