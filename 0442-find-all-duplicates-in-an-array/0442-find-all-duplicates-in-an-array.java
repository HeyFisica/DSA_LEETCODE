class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
          
        for(int e : nums)
{
    int i = Math.abs(e) -1;
    if(nums[i]<0){

    list.add(Math.abs(e)) ;   
}

    else{
        nums[i] = -nums[i];
    }
}

return list;
    }
}