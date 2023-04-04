package com.msz.SpringBootAlgorithmApi.Algorithms.BubbleSort;

public class BubbleSortAlgorithm {

    private int[] secretArray;

    public BubbleSortAlgorithm() {
    }

    public BubbleSortAlgorithm(int[] arrayToSort) {
        secretArray = arrayToSort;
    }

    public int[] bubbleSortMethodAscending(int[] arrayToSort) {

        checkIfArrayToSortIsNullAndThrowIllegalArgumentEpception(arrayToSort);
        int lengthOfArray = arrayToSort.length;

        for (int x = 0; x < lengthOfArray - 1; x++) {
            for (int y = 0; y < lengthOfArray - x - 1; y++) {
                if (arrayToSort[y] > arrayToSort[y + 1]) {
                    swap(arrayToSort, y, y + 1);
                }
            }
        }
        return arrayToSort;
    }

    public int[] bubbleSortMethodDescending(int[] arrayToSort) {

        checkIfArrayToSortIsNullAndThrowIllegalArgumentEpception(arrayToSort);
        int lengthOfArray = arrayToSort.length;

        for (int x = 0; x < lengthOfArray - 1; x++) {
            for (int y = 0; y < lengthOfArray - x - 1; y++) {
                if (arrayToSort[y] < arrayToSort[y + 1]) {
                    swap(arrayToSort, y, y + 1);
                }
            }
        }
        return arrayToSort;
    }

    private static void swap(int[] arrayToHandle, int first, int second) {
        int tempValue = arrayToHandle[first];
        arrayToHandle[first] = arrayToHandle[second];
        arrayToHandle[second] = tempValue;
    }

    private void checkIfArrayToSortIsNullAndThrowIllegalArgumentEpception(int[] arrayToSort) {
        if (arrayToSort == null) {
            throw new IllegalArgumentException("Illegal Argument Exception - Array is null!");
        }
    }
}



