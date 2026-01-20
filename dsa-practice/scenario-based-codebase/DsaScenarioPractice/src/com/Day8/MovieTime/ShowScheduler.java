package com.Day8.MovieTime;

class ShowScheduler {

    public static void insertionSort(int[] times) {
        for (int i = 1; i < times.length; i++) {
            int key = times[i];
            int j = i - 1;

            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
    }
}
