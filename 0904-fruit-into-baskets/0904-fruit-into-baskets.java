import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> mp = new HashMap<>();

        int result = 0;
        int i = 0, j = 0;

        while (j < n) {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);

            if (mp.size() <= 2) {
                result = Math.max(result, j - i + 1);
            } 
            else {
                while (mp.size() > 2) {
                    mp.put(fruits[i], mp.get(fruits[i]) - 1);

                    if (mp.get(fruits[i]) == 0) {
                        mp.remove(fruits[i]);
                    }

                    i++;
                }
            }

            j++;
        }

        return result;
    }
}