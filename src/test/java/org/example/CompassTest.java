package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Compass.Direction.RIGHT;
import static org.example.Compass.Point.EAST;
import static org.example.Compass.Point.NORTH;
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

}