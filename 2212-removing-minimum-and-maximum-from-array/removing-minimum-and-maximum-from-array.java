class Solution {
    public int minimumDeletions(int[] nums) {
        int maxidx = 0;
        int minidx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxidx] < nums[i])
                maxidx = i;

            if (nums[minidx] > nums[i])
                minidx = i;
        }
        int a = Math.min(minidx, maxidx);
        int b = Math.max(minidx, maxidx);

        int bothLeft = b + 1;
        int bothRight = nums.length - a;
        int fromBothEnds = (a + 1) + (nums.length - b);

        int ans = Math.min(bothLeft, Math.min(bothRight, fromBothEnds));

        return ans;

    }
}