class Solution {
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        int oneStep = 1;
        int twoStep = 2;

        for (int i = 3; i <= n; i++) {
            int total = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = total;
        }
        return twoStep;   
    }
}
