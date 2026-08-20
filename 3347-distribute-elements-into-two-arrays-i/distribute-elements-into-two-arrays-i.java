class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(idx1) > arr2.get(idx2)) {
                arr1.add(nums[i]);
                idx1++;
            }

            else {
                arr2.add(nums[i]);
                idx2++;
            }

        }

        for (int num : arr2)
            arr1.add(num);

        int ans[] = new int[nums.length];
        int i = 0;

        for (int num : arr1) {
            ans[i++] = num;
        }
        return ans;

    }

}
