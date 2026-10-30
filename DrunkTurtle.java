
import Turtle.*;

public class DrunkTurtle extends Turtle {
	private boolean tailDown;

	public DrunkTurtle() {
		super();
		this.tailDown = false; // נניח שהזנב מורם בהתחלה
	}

	@Override
	public void moveForward(double distance) {
		double newDistance = Math.random() * distance;
		moveWithCurrentTailState(newDistance);

		maybeTurnRight();

		newDistance = Math.random() * distance;
		moveWithCurrentTailState(Math.random() < 0.55 ? -newDistance : newDistance);
	}

	private void moveWithCurrentTailState(double distance) {
		if (tailDown) {
			super.moveForward(distance);
		} else {
			super.moveForward(distance);
		}
	}

	private void maybeTurnRight() {
		if (Math.random() < 0.40) {
			super.turnRight(90);
		}
	}

	@Override
	public void turnLeft(int angle) {
		int newAngle = (int) (Math.random() * 1.5 * angle);
		super.turnLeft(newAngle);
	}

	@Override
	public void turnRight(int angle) {
		int newAngle = (int) (Math.random() * 1.5 * angle);
		super.turnRight(newAngle);
	}

	@Override
	public void tailUp() {
		super.tailUp();
		this.tailDown = false;
	}

	@Override
	public void tailDown() {
		super.tailDown();
		this.tailDown = true;
	}

	public void moveForwardLikeASimpleTurtle(double distance) {
		this.tailUp();
		super.moveForward(distance);
	}

	// for test
	public static void main(String[] args) {
		DrunkTurtle drunkTurtle = new DrunkTurtle();
		drunkTurtle.tailUp();

		drunkTurtle.moveForward(100);
		drunkTurtle.turnRight(90);
		drunkTurtle.moveForward(100);

		drunkTurtle.tailDown();
		drunkTurtle.moveForward(100);
		drunkTurtle.turnRight(90);
		drunkTurtle.moveForward(100);
	}
}