class Solution {
    public int calPoints(String[] operations) {

        int score = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                int n = arr.size();
                int newScore = arr.get(n - 1) + arr.get(n - 2);

                arr.add(newScore);
                score += newScore;
            }

            else if (operations[i].equals("D")) {
                int newScore = 2 * arr.get(arr.size() - 1);

                arr.add(newScore);
                score += newScore;
            }

            else if (operations[i].equals("C")) {
                int removed = arr.remove(arr.size() - 1);

                score -= removed;
            }

            else {
                int newScore = Integer.parseInt(operations[i]);

                arr.add(newScore);
                score += newScore;
            }
        }

        return score;
    }
}