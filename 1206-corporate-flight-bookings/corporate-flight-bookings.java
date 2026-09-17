class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int flight[]=new int[n];

        for(int i=0;i<bookings.length;i++){
            for(int j=bookings[i][0]-1;j<bookings[i][1];j++){
                flight[j]+=bookings[i][2];
            }
        
        }
        System.out.println(Arrays.toString(flight));
        return flight;

    }
}