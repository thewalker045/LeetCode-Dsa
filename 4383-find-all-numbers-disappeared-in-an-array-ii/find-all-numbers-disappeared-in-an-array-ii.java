class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = lower;

        while (i <= upper) {

            if (set.contains(i)) {
                i++;
                continue;
            }

            int start = i;

            while (i <= upper && !set.contains(i)) {
                i++;
            }

            int end = i - 1;

            List<Integer> range = new ArrayList<>();
            range.add(start);
            range.add(end);

            list.add(range);
        }

        return list;
    }
}