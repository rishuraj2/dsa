package searching;

public class MinDaysToMakeBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (m*k))
            return -1;

        int minDay = 1;
        int maxDay = 0;
        for (int day : bloomDay) {
            maxDay = Math.max(maxDay, day);
        }

        while (minDay < maxDay) {
            int midDay = minDay + (maxDay - minDay)/2;
            if (canMakeBouquets(bloomDay, m, k, midDay)) {
                maxDay = midDay;
            } else {
                minDay = midDay + 1;
            }
        }

        return minDay;
    }

    private static boolean canMakeBouquets(int[] bloomDay, int bouquets, int flowers, int days) {
        int bouquetCounter = 0;
        int flowerCounter = 0;
        
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                flowerCounter++;
            } else {
                flowerCounter = 0;
            }

            if (flowerCounter == flowers) {
                bouquetCounter++;
                flowerCounter = 0;
            }
        }

        return bouquetCounter >= bouquets;
    }
}
