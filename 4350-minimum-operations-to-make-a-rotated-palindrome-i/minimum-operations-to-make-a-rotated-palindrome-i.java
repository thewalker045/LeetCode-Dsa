class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) {
            String rotated = s.substring(k) + s.substring(0, k);
            int operations = k;

            for (int i = 0; i < n / 2; i++) {
                int a = rotated.charAt(i) - 'a';
                int b = rotated.charAt(n - 1 - i) - 'a';

                int cost1 = (a - b + 26) % 26;
                int cost2 = (b - a + 26) % 26;

                operations += Math.min(cost1, cost2);
            }

            ans = Math.min(ans, operations);
        }

        return ans;
    }
}