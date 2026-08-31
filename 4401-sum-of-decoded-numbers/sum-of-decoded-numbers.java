class Solution {

    private static final long MOD = 1000000007L;

    public int[] returnValue(long num) {

      
        int width = (int)(num % 10);

      
        long d = num / 10;

        StringBuilder sb = new StringBuilder(String.valueOf(d));

       
        String s1 = sb.substring(0, width);

      
        String s2 = sb.substring(width);

        return new int[] {
            Integer.parseInt(s1),
            Integer.parseInt(s2)
        };
    }

    
    private long power(long a, long b) {

        long result = 1;

        a = a % MOD;

        while (b > 0) {

            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }

            a = (a * a) % MOD;

            b = b / 2;
        }

        return result;
    }

    public int sumDecoded(long[] nums) {

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int[] arr = returnValue(nums[i]);

            System.out.println(arr[0] + " " + arr[1]);

            
            sum = (sum + power(arr[0], arr[1])) % MOD;
        }

        return (int)sum;
    }
}