package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    int[] nums = {4, 2, 8, 6};

    @Test
    void testMaxUsingForLoop() {
        assertEquals(8, App.maximumUsingForLoop(nums));
    }

    @Test
    void testMinUsingForLoop() {
        assertEquals(2, App.minimumUsingForLoop(nums));
    }

    @Test
    void testSumUsingForLoop() {
        assertEquals(20, App.sumUsingForLoop(nums));
    }

    @Test
    void testAverageUsingForLoop() {
        assertEquals(5, App.averageUsingForLoop(nums));
    }

    @Test
    void testMaxUsingStream() {
        assertEquals(8, App.maximumUsingStream(nums));
    }

    @Test
    void testMinUsingStream() {
        assertEquals(2, App.minimumUsingStream(nums));
    }

    @Test
    void testSumUsingStream() {
        assertEquals(20, App.sumUsingStream(nums));
    }

    @Test
    void testAverageUsingStream() {
        assertEquals(5, App.averageUsingStream(nums));
    }
}
