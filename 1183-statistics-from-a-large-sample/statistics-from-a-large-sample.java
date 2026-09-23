class Solution {

    public double minimum(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 1)
                return i;
        }
        return 0;
    }

    public double maximum(int[] count) {
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] >= 1)
                return i;
        }
        return 0;
    }

    public double mean(int[] count) {
    long cnt = 0;
    long sum = 0;

    for (int i = 0; i < count.length; i++) {
        cnt += count[i];
        sum += (long) i * count[i];
    }

    return (double) sum / cnt;
}

    public double median(int[] count) {

        int cnt = 0;

        for (int num : count)
            cnt += num;

        int mid1 = (cnt + 1) / 2;
        int mid2 = (cnt + 2) / 2;

        int cnt2 = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < count.length; i++) {

            cnt2 += count[i];

            if (cnt2 >= mid1 && a == 0) {
                a = i;
            }

            if (cnt2 >= mid2) {
                b = i;
                break;
            }
        }

        return (a + b) / 2.0;
    }

    public double[] sampleStats(int[] count) {

        return new double[] {
            minimum(count),
            maximum(count),
            mean(count),
            median(count),
            mode(count)
        };
    }

    public double mode(int[] count) {

        int max = 0;
        int ans = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ans = i;
            }
        }

        return ans;
    }
}