import java.util.*;

class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {

        Map<Long, Integer> map1 = new HashMap<>();
        Map<Long, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                long product = (long) nums1[i] * nums1[j];
                map1.put(product, map1.getOrDefault(product, 0) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                long product = (long) nums2[i] * nums2[j];
                map2.put(product, map2.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;

        for (int x : nums1) {
            long square = (long) x * x;
            count += map2.getOrDefault(square, 0);
        }

        for (int x : nums2) {
            long square = (long) x * x;
            count += map1.getOrDefault(square, 0);
        }

        return count;
    }
}