import Turtle.*;

public class GrumpyTurtle extends DrunkTurtle {
	public GrumpyTurtle() {
		super();
	}

	@Override
	public void moveForward(double distance) {
		if (Math.random() < 0.50) {
			super.moveForward(distance);
		} else {
			this.turnRight(180);
		}
	}

	public static void main(String[] args) {
		GrumpyTurtle grumpyTurtle = new GrumpyTurtle();

		// Demonstrate the behavior
		grumpyTurtle.tailUp();

		grumpyTurtle.moveForward(120);
		grumpyTurtle.tailDown();

		grumpyTurtle.turnRight(120);
		grumpyTurtle.moveForward(120);
		grumpyTurtle.turnRight(120);
	}
}