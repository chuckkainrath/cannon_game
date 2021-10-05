package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TargetHitTest {

    @Test
    public void testTargetHit() {
        // Given: Our final x and y coordinates are (7, 7) and our target is (7, 7)
        int shotX = 7;
        int shotY = 7;
        int targetX = 7;
        int targetY = 7;


        // When: We determine if our cannon hits
        ITargetHit targetHit = new TargetHit();
        boolean hit = targetHit.hit(shotX, shotY, targetX, targetY);

        // Then: I have successfully hit the target
        assertTrue(hit);
    }

    @Test
    public void testTargetHitXMissY() {
        // Given: Our final x and y coordinates are (7, 8) and our target is (7, 7)
        int shotX = 7;
        int shotY = 8;
        int targetX = 7;
        int targetY = 7;


        // When: We determine if our cannon hits
        ITargetHit targetHit = new TargetHit();
        boolean hit = targetHit.hit(shotX, shotY, targetX, targetY);

        // Then: I have missed the target
        assertFalse(hit);
    }

    @Test
    public void testTargetHitYMissX() {
        // Given: Our final x and y coordinates are (8, 7) and our target is (7, 7)
        int shotX = 8;
        int shotY = 7;
        int targetX = 7;
        int targetY = 7;


        // When: We determine if our cannon hits
        ITargetHit targetHit = new TargetHit();
        boolean hit = targetHit.hit(shotX, shotY, targetX, targetY);

        // Then: I have missed the target
        assertFalse(hit);
    }

    @Test
    public void testTargetMissXMissY() {
        // Given: Our final x and y coordinates are (8, 8) and our target is (7, 7)
        int shotX = 8;
        int shotY = 8;
        int targetX = 7;
        int targetY = 7;


        // When: We determine if our cannon hits
        ITargetHit targetHit = new TargetHit();
        boolean hit = targetHit.hit(shotX, shotY, targetX, targetY);

        // Then: I have missed the target
        assertFalse(hit);
    }
}
