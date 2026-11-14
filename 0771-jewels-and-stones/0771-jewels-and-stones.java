class Solution {
    public int numJewelsInStones(String jw, String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < jw.length(); j++) {
                if (s.charAt(i) == jw.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}