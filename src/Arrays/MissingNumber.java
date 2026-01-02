package arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int missingNumber = 0;
        
        int[] numberRegister = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            numberRegister[nums[i]] = -1;
        }

        while(missingNumber < numberRegister.length) {
              if (numberRegister[missingNumber] != -1)
                break;
            missingNumber++;
        }

        return missingNumber;
    }
}
