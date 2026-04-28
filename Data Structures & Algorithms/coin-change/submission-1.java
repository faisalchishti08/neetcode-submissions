class Solution {
    public int coinChange(int[] coins, int amount) {

        int result = 0;

        int []amounts = new int[amount+1];
        Arrays.fill(amounts, amount+1);


        amounts[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j <= coins.length - 1; j++) {
                //    System.out.println("=-----------\n");
                //               System.out.println("i = " + i + "\n");
                // System.out.println("j = " + j + "\n");
                if(coins[j] <= i) {
                 
         
                    // System.out.println("amounts[i] = " + amounts[i] + "\n");
                    // System.out.println("coins[j] = " + coins[j] + "\n");
                    // System.out.println("amounts[i - coins[j]] = " + amounts[i - coins[j]] + "\n");
                    // System.out.println("1 + amounts[i - coins[j]] = " + (1 + amounts[i - coins[j]]) + "\n");

                    amounts[i] = Math.min(amounts[i], 1 + amounts[i - coins[j]]);
                //    System.out.println(" New amounts[i] = " + amounts[i] + "\n");

                }
            }
        }
        if (amounts[amount] < amount+1) {
            return amounts[amount];
        } 
        
        return -1;
    }
}
