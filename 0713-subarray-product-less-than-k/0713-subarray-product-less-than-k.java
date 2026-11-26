class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int n = nums.length;
        int i = 0, j = 0;
        int count = 0;
        int product = 1;

        if(k<=1){
            return 0;
        }

        while(j<n){
            product *= nums[j];

            while(product>=k){
                 product /= nums[i];
                 i++;
            }

            count = count+(j-i+1);
             j++;
        }

        

        return  count;
        
    }
}