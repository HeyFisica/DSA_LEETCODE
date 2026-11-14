class Solution {
    public int numJewelsInStones(String jw, String s) {
        int count = 0;

        Set<Character> map =  new HashSet<>();
        for(int i = 0;i<jw.length();i++){
            map.add(jw.charAt(i));
        }
         

       
        for(int i =0 ;i<s.length();i++){
            
            if(map.contains(s.charAt(i))){
                count++;
            }
        }

 return count++;
    }
}