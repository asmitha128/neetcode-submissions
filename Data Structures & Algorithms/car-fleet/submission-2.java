class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> Integer.compare(position[a], position[b]));

        int fleets = 0;
        double maxTime = 0;

        for (int k = n - 1; k >= 0; k--) {
            int i = idx[k];

            double time = (double) (target - position[i]) / speed[i];

            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }

        return fleets;
    }
}