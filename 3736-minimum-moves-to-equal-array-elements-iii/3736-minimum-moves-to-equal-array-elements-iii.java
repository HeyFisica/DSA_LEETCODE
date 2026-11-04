class Solution {
    public int minMoves(int[] nums) {
       
        int max = Integer.MIN_VALUE;

        for(int i:nums){
          max = Math.max(i, max);
        }

         int count = 0;
        for (int num : nums) {
            count += (max - num); 
        }
        return count;
    }
}