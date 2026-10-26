class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int longest = 0;

        for(int n:nums){
            st.add(n);
        }

        for(int num:st){
            if(!st.contains(num-1)){

                int cnum = num;
                int count = 1;
                while(st.contains(cnum+1)){
                    cnum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
        
    }
}