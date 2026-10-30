class Solution {
    public String toHex(int num) {
       StringBuilder ans = new StringBuilder();
       char[] hex = "0123456789abcdef".toCharArray();
        
        if(num==0){
            return "0";
        }

       while(num!=0){
        ans.append(hex[num&15]);
        num>>>= 4;
       }
         return ans.reverse().toString();
    }
}