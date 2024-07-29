package org.example;

public class Compass {
    public enum Point{WEST, EAST, NORTH, SOUTH};
    public enum Direction{LEFT,RIGHT};
    Point point;
    Direction direction;

    public Point rotate(Point point, Direction direction) {
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
        return point;
    }

}
