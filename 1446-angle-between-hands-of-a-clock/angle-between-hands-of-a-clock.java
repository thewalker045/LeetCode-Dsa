
class Solution {
    public double angleClock(int hour, int minutes) {
        double Mangle = 6 * minutes;
        double Hangle = 30 * (hour % 12) + 0.5 * minutes;

        double ans = Math.abs((Hangle - Mangle));

        return Math.min(ans, 360 - ans);
    }
}