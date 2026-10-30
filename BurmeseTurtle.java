import Turtle.*;

public class BurmeseTurtle extends IntelligentTurtle {
	public BurmeseTurtle() {
		super();
	}

	@Override
	public void moveForward(double distance) {
		// Use the inherited method to move without leaving a trace when tail is up
		this.moveWithoutTrace(distance);
	}

	@Override
	public void draw(int sides, double size) {
		int angle = 360 / sides;
		this.tailDown();

		if (Math.random() < 0.40) {
			// Draw sides - 1 sides with the given size
			for (int i = 0; i < sides - 1; i++) {
				super.moveForward(size);
				this.turnRight(angle);
			}
			// Hide the turtle immediately after the last side is skipped
			this.hide();
		} else {
			// Draw a complete polygon with sides of length 18
			for (int i = 0; i < sides; i++) {
				super.moveForward(18);
				this.turnRight(angle);
			}
		}

		this.tailUp();
	}

	public static void main(String[] args) {
		BurmeseTurtle Burmese = new BurmeseTurtle();

		// Draw a 10-sided polygon with tail down
		Burmese.tailDown();
		Burmese.draw(10, 50);

	}
}