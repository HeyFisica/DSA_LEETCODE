class Solution {
    public String removeOuterParentheses(String s) {
        String st = "";
        int count = 0;

       for(char ch :s.toCharArray()){
        if(ch=='('){
            if(count>0)st += ch;
                count++;
            
        }
            else if(ch==')'){
               count--;
                if(count>0) st+=ch;

                
            }
        

       }
       return st;
        
    }
}