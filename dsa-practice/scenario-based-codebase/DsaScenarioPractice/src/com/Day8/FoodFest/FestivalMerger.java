package com.Day8.FoodFest;

class FestivalMerger {

    public static int[] mergeAllZones(int[][] zones) {

        int total = 0;
        for (int i = 0; i < zones.length; i++) {
            total += zones[i].length;
        }

        int[] result = new int[total];

        int[] index = new int[zones.length]; // pointers for each zone
        int k = 0;

        while (k < total) {

            int minZone = -1;
            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < zones.length; i++) {
                if (index[i] < zones[i].length &&
                    zones[i][index[i]] < minValue) {

                    minValue = zones[i][index[i]];
                    minZone = i;
                }
            }

            result[k++] = minValue;
            index[minZone]++;
        }

        return result;
    }
}
