class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        s += s;

        int k = goal.length();

        for (int i = 0; i <= s.length() - k; i++) {
            if (s.substring(i, i + k).equals(goal))
                return true;
        }

        return false;
    }
}