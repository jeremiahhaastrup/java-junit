package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Compass.Direction.*;
import static org.example.Compass.Point.*;
import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    @Test
    @DisplayName("Test for rotate for North and Right to East")
    public void testRotateForNorthAndRightToEast() {
        Compass compass = new Compass();
        compass.point = NORTH;
        compass.direction = RIGHT;

        var result = compass.rotate(compass.point, compass.direction);
        assertEquals(EAST, result);
    }

    @Test
    @DisplayName("Test all points with direction right")
    public void testAllPointsWithRight(){
        Compass compass = new Compass();
        compass.direction = RIGHT;
        assertAll(
                () -> assertEquals(EAST, compass.rotate(NORTH, compass.direction)),
                () -> assertEquals(SOUTH, compass.rotate(EAST, compass.direction)),
                () -> assertEquals(WEST, compass.rotate(SOUTH, compass.direction)),
                () -> assertEquals(NORTH, compass.rotate(WEST, compass.direction))
        );

    }

    @Test
    @DisplayName("Test all points with direction left")
    public void testAllPointsWithLeft() {
        Compass compass = new Compass();
        compass.direction = LEFT;
        assertAll(
                () -> assertEquals(WEST, compass.rotate(NORTH, compass.direction)),
                () -> assertEquals(NORTH, compass.rotate(EAST, compass.direction)),
                () -> assertEquals(EAST, compass.rotate(SOUTH, compass.direction)),
                () -> assertEquals(SOUTH, compass.rotate(WEST, compass.direction))
        );
    }
}