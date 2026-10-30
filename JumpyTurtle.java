import Turtle.*;

public class JumpyTurtle extends IntelligentTurtle {
    private boolean tailIsDown; //for test tail status

    public JumpyTurtle() {
        super();
        tailIsDown = false;  
    }

    @Override
    public void moveForward(double distance) {
        double segment = 6.0;
        while (distance > 0) {
            if (distance < segment) {
                if (tailIsDown) {
                    super.moveForward(distance);
                } else {
                    super.moveWithoutTrace(distance);
                }
                distance = 0;
            } else {
                if (tailIsDown) {
                    super.moveForward(segment);
                    super.tailUp();
                    super.moveWithoutTrace(segment);
                    super.tailDown();
                } else {
                    super.moveWithoutTrace(segment);
                }
                distance -= 2 * segment;
            }
        }
    }

    @Override
    public void tailDown() {
        super.tailDown();
        tailIsDown = true;
    }

    @Override
    public void tailUp() {
        super.tailUp();
        tailIsDown = false;
    }

    @Override
    public void draw(int sides, double length) {
        boolean wasTailDown = this.tailIsDown;
        if (!wasTailDown) {
            this.tailDown();
        }
        for (int i = 0; i < sides; i++) {
            moveForward(length);
            int degree = 360 / sides;
            this.turnRight(degree);
        }
        if (!wasTailDown) {
            this.tailUp();
        }
    }
//for test
    public static void main(String[] args) {
        JumpyTurtle jumpyTurtle = new JumpyTurtle();
        jumpyTurtle.tailDown();
        jumpyTurtle.moveForward(50);
        jumpyTurtle.turnRight(90);
        jumpyTurtle.moveForward(50);
        jumpyTurtle.moveForward(100);
        jumpyTurtle.draw(10, 50);
        jumpyTurtle.tailUp();
        jumpyTurtle.moveForward(1000);


    }
}