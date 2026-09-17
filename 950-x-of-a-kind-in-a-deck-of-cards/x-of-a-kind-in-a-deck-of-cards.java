import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : deck) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int gcd = 0;

        for (int freq : map.values()) {
            gcd = findGcd(gcd, freq);
        }

        return gcd >= 2;
    }

    public int findGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}