import java.util.*;

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        long MOD = 1000000007L;

        int[] freq = new int[n + 1];

        for (int[] req : requests) {
            freq[req[0]]++;
            freq[req[1] + 1]--;
        }

        for (int i = 1; i < n; i++) {
            freq[i] += freq[i - 1];
        }

        Arrays.sort(nums);
        Arrays.sort(freq, 0, n);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + (long) nums[i] * freq[i]) % MOD;
        }

        return (int) ans;
    }
}