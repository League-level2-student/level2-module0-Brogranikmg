package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	public static void main(String[] args) {
		Robot[] robox = new Robot[5];
		for (int bots = 0; bots < robox.length; bots++) {
			robox[bots] = new Robot();
			robox[bots].moveTo(bots * 100 + 125, 600);
			robox[bots].setSpeed(10);
		}
		Robot.setWindowSize(650, 650);
		Boolean robgottop = false;
		Random randrat = new Random();
		int winner = 0;
		while (robgottop == false) {
			for (int react = 0; react < robox.length; react++) {
				robox[react].move(randrat.nextInt(50));
				if (robox[react].getY() < 50) {
					robgottop = true;
					winner = react;
					break;
				}
			}
		}
		System.out.println("Robot #" + (winner + 1) + " is the winner!");
		robox[winner].sparkle();
		robox[winner].turn(360);
		robox[winner].turn(-360);
		
	}
	//1. make a main method

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
