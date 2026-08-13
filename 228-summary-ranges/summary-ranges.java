class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0) return list;
        if(nums.length==1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i] - 1) {
                if (prev == nums[i - 1]) {
                    list.add(String.valueOf(nums[i - 1]));
                    prev = nums[i];
                } else {
                    String s = prev + "->" + nums[i - 1];
                    list.add(s);
                    prev = nums[i];
                }
            }

        }

        if (nums[nums.length - 1] - 1 != nums[nums.length - 2]) {
            list.add(String.valueOf(nums[nums.length - 1]));
        } else {
            String s = prev + "->" + nums[nums.length - 1];
            list.add(s);
        }

        return list;

    }
}