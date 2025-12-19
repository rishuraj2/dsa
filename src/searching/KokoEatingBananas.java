package searching;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int minEatingSpeed = 1;
        int maxEatingSpeed = piles[0];
        for (int pile : piles) {
            maxEatingSpeed = Math.max(pile, maxEatingSpeed);
        }

        while (minEatingSpeed < maxEatingSpeed) {
            int midEatingSpeed = minEatingSpeed + (maxEatingSpeed - minEatingSpeed)/2;

            if (checkSpeed(piles, midEatingSpeed, h)) {
                maxEatingSpeed = midEatingSpeed;
            } else {
                minEatingSpeed = midEatingSpeed+1;
            }

        }
        return minEatingSpeed;
    }

    private static boolean checkSpeed(int[] piles, int eatingSpeed, int hours) {
        int hoursTaken = 0;
        for(int pile : piles) {
            int wholeHour = pile / eatingSpeed;

            if (pile % eatingSpeed != 0)
                wholeHour++;

            hoursTaken += wholeHour;
        }
        
        return hoursTaken <= hours;
    }
}
