class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        for (int num : nums) {
           if (num > 0 && num <= n) {
              present[num] = true;
           }
        }
        for (int i = 1; i <= n; i++) {
             if (!present[i]) {
               return i;
             }
        }
    
        return n + 1;
    }
}
