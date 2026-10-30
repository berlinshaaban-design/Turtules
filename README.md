# Turtle Simulation — Java OOP Project

**Academic Java Project | Object-Oriented Programming**

A Java project exploring object-oriented programming through a turtle graphics simulation. Different turtle classes extend the base turtle behavior to create distinct movement and drawing patterns.

## Project overview

The project defines several turtle types, each with its own movement rules. The `Army` program lets the user choose five turtles and applies a sequence of movement and drawing instructions.

## Turtle types

- **IntelligentTurtle:** Draws polygons and supports movement without leaving a trace.
- **DrunkTurtle:** Adds randomized movement distances and turning angles.
- **JumpyTurtle:** Creates movement patterns with alternating drawn and undrawn segments.
- **GrumpyTurtle:** May move or turn around based on a random choice.
- **BurmeseTurtle:** Extends the intelligent turtle with alternative polygon-drawing behavior.

## Object-oriented concepts

- **Inheritance:** Specialized turtles extend `Turtle` or another specialized turtle class.
- **Polymorphism:** The `Army` program stores different turtle types in a `Turtle[]` array.
- **Method overriding:** Turtle subclasses customize movement, turning, and drawing methods.
- **Encapsulation:** Classes maintain internal state for drawing and movement behavior.

## Main files

| File | Description |
| --- | --- |
| [Army.java](Army.java) | Interactive selection and coordinated movement of five turtles |
| [IntelligentTurtle.java](IntelligentTurtle.java) | Polygon drawing and trace-free movement |
| [DrunkTurtle.java](DrunkTurtle.java) | Randomized movement behavior |
| [JumpyTurtle.java](JumpyTurtle.java) | Segmented movement and drawing |
| [GrumpyTurtle.java](GrumpyTurtle.java) | Randomized turning behavior |
| [BurmeseTurtle.java](BurmeseTurtle.java) | Specialized polygon drawing |
| [TwoTurtles.java](TwoTurtles.java) | Drawing with two turtles |
| [Turtle.jar](Turtle.jar) | Turtle graphics library used by the project |

## Technologies

**Java · Object-Oriented Programming · Inheritance · Polymorphism · Turtle Graphics · Eclipse**

## Running the project

The source files depend on the included `Turtle.jar` library. Add the JAR to the Java project's build path in Eclipse, then run `Army.java` or the individual classes containing a `main` method.

## Notes

This is an academic programming project intended to demonstrate OOP concepts and customized class behavior. Compiled `.class` files and Eclipse configuration files are included alongside the source code.
