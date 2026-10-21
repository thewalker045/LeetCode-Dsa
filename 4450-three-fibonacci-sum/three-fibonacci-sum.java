class Solution {
    public boolean threeFibonacciSum(int n) {
        long first = 0;
        long second = 1;

        while (true) {
            long next = first + second;
            long sum = first + second + next;

            if (sum == n) return true;
            if (sum > n) return false;

            first = second;
            second = next;
        }
    }
}