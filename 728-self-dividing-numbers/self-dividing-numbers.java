class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        boolean flag = true;
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int x = i;
            flag = true;
            while (x > 0) {
                int num = x % 10;
                x /= 10;
                if (num == 0) {
                    flag = false;
                    continue;
                }
                if (i % num != 0) {
                    flag = false;
                    continue;
                }

            }
            if (flag == true)
                list.add(i);
        }
        return list;
    }
}