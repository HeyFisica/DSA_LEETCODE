class Solution {
    public int findDuplicate(int[] nums) {

        // HashSet<Integer> hash = new HashSet<>();
        // for(int n:nums){
        //     if(hash.contains(n)){
        //         return n;
        //     }
        //     hash.add(n);
        // }
        // return -1;

       

       //two pointer apprach

       int i = 0;
       int j = i+1;
      Arrays.sort(nums);
       while(i<nums.length){
        if(nums[i]==nums[j]) 
        

         {
      return nums[i];
        } 
 i++;
       j++;
       }
      

   return -1;

    }
}