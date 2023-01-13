package Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(5, 5, Robot.Direction.UP);
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
        robot.getDirection();
        System.out.println("Direction = " + robot.getDirection());
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
        robot.turnLeft();
        robot.getDirection();
        System.out.println("Direction = " + robot.getDirection());
        robot.stepForward();
        robot.stepForward();
        System.out.println("X = " + robot.getX() + " " + "Y = " + robot.getY());
    }

}
