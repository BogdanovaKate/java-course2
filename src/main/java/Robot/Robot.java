package Robot;

public class Robot {
    int x;
    int y;
    Direction direction;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;

        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;
        }
    }

    public void turnRight() {
        if (direction == Direction.UP) {
            Direction direction = Direction.RIGHT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.UP;
        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        if (direction == Direction.UP) {
            y = y + 1;
        }
        if (direction == Direction.DOWN) {
            y = y - 1;
        }
        if (direction == Direction.LEFT) {
            x = x - 1;
        }
        if (direction == Direction.RIGHT) {
            x = x + 1;
        }

    }
}
