package Robot;

import com.sun.javafx.scene.traversal.Direction;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(5, 5, Robot.Direction.UP);
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
        robot.getDirection();
        System.out.println("Direction = " + robot.getDirection());
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
        robot.turnRight();
        robot.getDirection();
        System.out.println("Direction = " + robot.getDirection());
        robot.stepForward();
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
        Robot robot1 = new Robot(5, 5, Robot.Direction.UP);
        System.out.println("X = " + robot1.getX() + " " + "Y = " + robot1.getY());
        moveRobot(robot1, 10, 15);
        System.out.println("X1 = " + robot1.getX() + " " + "Y1 = " + robot1.getY());
    }

    public static void moveRobot(Robot robot1, int toX, int toY) {
        int x = robot1.getX();
        int y = robot1.getY();
        Robot.Direction direction = robot1.getDirection();
        if (toX > x) {
            if (direction == Robot.Direction.DOWN) {
                robot1.turnLeft();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.UP) {
                robot1.turnRight();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.LEFT) {
                robot1.turnRight();
                robot1.turnRight();
                direction = robot1.getDirection();
            }
            robot1.stepForward();
            x = robot1.getX();
            while (toX > x) {
                robot1.stepForward();
                x = robot1.getX();
            }
        }
        if (toX < x) {
            if (direction == Robot.Direction.RIGHT) {
                robot1.turnRight();
                robot1.turnRight();
                direction = robot1.getDirection();

            } else if (direction == Robot.Direction.DOWN) {
                robot1.turnRight();
                direction = robot1.getDirection();

            } else if (direction == Robot.Direction.UP) {
                robot1.turnLeft();
                direction = robot1.getDirection();
            }
            robot1.stepForward();
            x = robot1.getX();
            while (toX < x) {
                robot1.stepForward();
                x = robot1.getX();
            }
        }
        if (toY > y) {
            if (direction == Robot.Direction.DOWN) {
                robot1.turnRight();
                robot1.turnRight();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.RIGHT) {
                robot1.turnLeft();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.LEFT) {
                robot1.turnRight();
                direction = robot1.getDirection();
            }
            robot1.stepForward();
            y = robot1.getY();
            while (toY > y) {
                robot1.stepForward();
                y = robot1.getY();
            }
        }
        if (toY < y) {
            if (direction == Robot.Direction.UP) {
                robot1.turnLeft();
                robot1.turnLeft();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.RIGHT) {
                robot1.turnRight();
                direction = robot1.getDirection();
            } else if (direction == Robot.Direction.LEFT) {
                robot1.turnLeft();
                direction = robot1.getDirection();
            }
            robot1.stepForward();
            y = robot1.getY();
            while (toY < y) {
                robot1.stepForward();
                y = robot1.getY();
            }
        }
    }
}




