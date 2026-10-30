import java.util.Scanner;
import Turtle.*;

public class Army {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Turtle[] turtles = new Turtle[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Choose the type of a turtle:");
			System.out.println("1. Simple");
			System.out.println("2. Intelligent");
			System.out.println("3. Drunk");
			System.out.println("4. Jumpy");
			System.out.println("5. Grumpy");
			System.out.println("6. Burmese");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				turtles[i] = new Turtle();
				break;
			case 2:
				turtles[i] = new IntelligentTurtle();
				break;
			case 3:
				turtles[i] = new DrunkTurtle();
				break;
			case 4:
				turtles[i] = new JumpyTurtle();
				break;
			case 5:
				turtles[i] = new GrumpyTurtle();
				break;
			case 6:
				turtles[i] = new BurmeseTurtle();
				break;
			default:
				System.out.println("Invalid choice! Defaulting to Simple Turtle.");
				turtles[i] = new Turtle();
			}
		}
		// for test
//      turtles[0] = new JumpyTurtle();
//      turtles[1] = new IntelligentTurtle();
//      turtles[2] = new JumpyTurtle();
//      turtles[3] = new IntelligentTurtle();
//      turtles[4] = new JumpyTurtle();

		// Step 1: Arrange turtles in a line with a distance of 120 between them without
		// leaving marks
		for (Turtle turtle : turtles) {
			turtle.tailUp();
		}

		double distance = 0;
		for (Turtle turtle : turtles) {
			turtle.moveForward(distance);
			distance += 120;
		}

		// Step 2: Lower the tails of all turtles
		for (Turtle turtle : turtles) {
			turtle.tailDown();
		}

		// Step 3: Move turtles forward by 55 units
		for (Turtle turtle : turtles) {
			turtle.moveForward(55);
		}

		// Step 4: Turn left by 45 degrees
		for (Turtle turtle : turtles) {
			turtle.turnLeft(45);
		}

		// Step 5: Move turtles forward by 80 units
		for (Turtle turtle : turtles) {
			turtle.moveForward(80);
		}

		// Step 6: Draw a hexagon for Intelligent Turtles
		for (Turtle turtle : turtles) {
			if (turtle instanceof IntelligentTurtle) {
				((IntelligentTurtle) turtle).draw(6, 26);
			}
		}

		// Step 7: Hide all turtles
		for (Turtle turtle : turtles) {
			turtle.hide();
		}

		scanner.close();
	}
}
