import Turtle.*;

class IntelligentTurtle extends Turtle {
	private boolean tailDown;

	public IntelligentTurtle() {
		super();
		this.tailDown = false; // הזנב מורם בהתחלה
	}

	@Override
	public void moveForward(double distance) {
		if (tailDown) {
			super.moveForward(distance);
		} else {
			moveWithoutTrace(distance);
		}
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

	// Draw a polygon with the given number of sides and side length
	public void draw(int sides, double length) {
		boolean wasTailDown = this.tailDown;
		if (!wasTailDown) {
			this.tailDown();
		}
		for (int i = 0; i < sides; i++) {
			super.moveForward(length);
			int degree = 360 / sides;
			this.turnRight(degree);
		}
		if (!wasTailDown) {
			this.tailUp();
		}
	}

	// Move without leaving a trace when tail is up
	public void moveWithoutTrace(double distance) {
		boolean wasTailDown = this.tailDown;
		if (wasTailDown) {
			this.tailUp();
		}
		super.moveForward(distance);
		if (wasTailDown) {
			this.tailDown();
		}
	}

	// For test
	public static void main(String[] args) {
		IntelligentTurtle intelligentTurtle = new IntelligentTurtle();

		// Draw a 10-sided polygon with tail down
		intelligentTurtle.tailDown();
		intelligentTurtle.draw(10, 50);
		intelligentTurtle.tailUp();
		intelligentTurtle.moveForward(200);

	}
}
