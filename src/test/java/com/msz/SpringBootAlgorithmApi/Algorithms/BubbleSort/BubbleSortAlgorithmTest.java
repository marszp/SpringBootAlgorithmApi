package com.msz.SpringBootAlgorithmApi.Algorithms.BubbleSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortAlgorithmTest {

    private int[] arrayToSort = {-1, 4, -3, 2, 51};
    private int[] resultAscending = {-3, -1, 2, 4, 51};
    private int[] resultDescending = {51, 4, 2, -1, -3};
    private BubbleSortAlgorithm tempBubbleSortObject = new BubbleSortAlgorithm();

    @Test
    public void shouldBubbleSortBeNullObject() {
        assertFalse(tempBubbleSortObject.equals(null));
    }

    @Test
    public void shouldBubbleSortMethodAscending() {
        assertArrayEquals(resultAscending, tempBubbleSortObject.bubbleSortMethodAscending(arrayToSort));
    }

    @Test
    public void shouldBubbleSortMethodDescending() {
        assertArrayEquals(resultDescending, tempBubbleSortObject.bubbleSortMethodDescending(arrayToSort));
    }

    @Test
    public void shouldBubbleSortThrowIllegalArgumentExceptionAtMethodAscending() {
        assertThrows(IllegalArgumentException.class, () -> {
            tempBubbleSortObject.bubbleSortMethodAscending(null);
        });
    }

    @Test
    public void shouldBubbleSortThrowIllegalArgumentExceptionAtMethodDescending() {
        assertThrows(IllegalArgumentException.class, () -> {
            tempBubbleSortObject.bubbleSortMethodDescending(null);
        });
    }
}