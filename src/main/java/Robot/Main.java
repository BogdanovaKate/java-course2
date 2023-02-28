package Robot;

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
        if (toX > robot1.getX()) {
            if (robot1.getDirection() == Robot.Direction.DOWN) {
                robot1.turnLeft();
            } else if (robot1.getDirection() == Robot.Direction.UP) {
                robot1.turnRight();

            } else if (robot1.getDirection() == Robot.Direction.LEFT) {
                robot1.turnRight();
                robot1.turnRight();
            }
            robot1.stepForward();
            while (toX > robot1.getX()) {
                robot1.stepForward();
            }
        }
        if (toX < robot1.getX()) {
            if (robot1.getDirection() == Robot.Direction.RIGHT) {
                robot1.turnRight();
                robot1.turnRight();

            } else if (robot1.getDirection() == Robot.Direction.DOWN) {
                robot1.turnRight();

            } else if (robot1.getDirection() == Robot.Direction.UP) {
                robot1.turnLeft();
            }
            robot1.stepForward();
            while (toX < robot1.getX()) {
                robot1.stepForward();
            }
        }
        if (toY > robot1.getY()) {
            if (robot1.getDirection() == Robot.Direction.DOWN) {
                robot1.turnRight();
                robot1.turnRight();
            } else if (robot1.getDirection() == Robot.Direction.RIGHT) {
                robot1.turnLeft();
            } else if (robot1.getDirection() == Robot.Direction.LEFT) {
                robot1.turnRight();
            }
            robot1.stepForward();
            while (toY > robot1.getY()) {
                robot1.stepForward();
            }
        }
        if (toY < robot1.getY()) {
            if (robot1.getDirection() == Robot.Direction.UP) {
                robot1.turnLeft();
                robot1.turnLeft();
            } else if (robot1.getDirection() == Robot.Direction.RIGHT) {
                robot1.turnRight();

            } else if (robot1.getDirection() == Robot.Direction.LEFT) {
                robot1.turnLeft();
            }
            robot1.stepForward();
            while (toY < robot1.getY()) {
                robot1.stepForward();
            }
        }
    }
}




