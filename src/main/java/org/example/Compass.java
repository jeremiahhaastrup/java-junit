package org.example;

import static org.example.Compass.Direction.*;

public class Compass {
    public enum Point{WEST, EAST, NORTH, SOUTH};
    public enum Direction{LEFT,RIGHT};
    Point point;
    Direction direction;

    public Point rotate(Point point, Direction direction) {
        if (direction == Direction.LEFT) {
            switch (point){
                case NORTH:
                    return Point.WEST;
                case EAST:
                    return Point.NORTH;
                case SOUTH:
                    return Point.EAST;
                case WEST:
                    return Point.SOUTH;
            }
        } else if (direction == Direction.RIGHT) {
            switch (point){
                case NORTH:
                    return Point.EAST;
                case EAST:
                    return Point.SOUTH;
                case SOUTH:
                    return Point.WEST;
                case WEST:
                    return Point.NORTH;
            }
        }
        return point;
    }

}
