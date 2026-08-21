class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1, r = num;

        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (mid == num / mid && num % mid == 0)
                return true;

            if (mid < num / mid)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return false;
    }
}