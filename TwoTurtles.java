
import Turtle.*;

public class TwoTurtles {

	public static void main(String[] args) {
		IntelligentTurtle Ezi = new IntelligentTurtle();
		IntelligentTurtle Edi = new IntelligentTurtle();

		// Draw the monster body
		drawBody(Edi);
		drawArmsAndLeds(Ezi);
	}

	// Function to draw the body
	public static void drawBody(Turtle turtle) {
		turtle.moveForward(100);
		turtle.turnLeft(90);
		turtle.moveForward(50);
		turtle.turnRight(90);
		turtle.moveForward(100);
		turtle.turnRight(90);
		turtle.moveForward(100);
		turtle.turnRight(90);
		turtle.moveForward(100);
		turtle.turnRight(90);
		turtle.moveForward(50);
		turtle.tailUp();
		turtle.hide();
	}

	// Function to draw the arms and legs
	public static void drawArmsAndLeds(Turtle turtle) {
		turtle.show();
		turtle.tailDown();
		turtle.moveForward(50);
		turtle.turnLeft(90);
		turtle.moveForward(70);
		turtle.turnRight(180);
		turtle.moveForward(140);
		turtle.tailUp();
		turtle.turnRight(90);
		turtle.moveForward(50);
		turtle.turnRight(90);
		turtle.moveForward(70);
		turtle.turnRight(-135);
		turtle.tailDown();
		turtle.moveForward(70);
		turtle.tailUp();
		turtle.moveForward(-70);
		turtle.turnRight(-270);
		turtle.tailDown();
		turtle.moveForward(70);
		turtle.tailUp();
		turtle.hide();
	}

}
