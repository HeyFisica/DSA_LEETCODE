import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int MOD = 1_000_000_007;
        int[] bitCounts = new int[31]; // Since numbers are up to 2^31 - 1, we check 31 bit positions

        // Step 1: Count the frequency of each bit set across all numbers
        for (int num : nums) {
            for (int i = 0; i <= 30; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }

        // Step 2: Construct the k numbers by greedily placing bits from MSB to LSB
        long[] kNums = new long[k];
        for (int i = 30; i >= 0; i--) {
            int count = bitCounts[i];
            // Assign the i-th bit to the top 'count' numbers (up to k)
            for (int j = 0; j < k && j < count; j++) {
                kNums[j] |= (1L << i);
            }
        }

        // Step 3: Calculate the sum of squares modulo 10^9 + 7
        long totalSum = 0;
        for (int i = 0; i < k; i++) {
            long square = (kNums[i] % MOD * kNums[i] % MOD) % MOD;
            totalSum = (totalSum + square) % MOD;
        }

        return (int) totalSum;
    }
}