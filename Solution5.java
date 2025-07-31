class Solution5 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int remBottles = numBottles % numExchange;
            int newBottles = numBottles / numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;

        }
        return ans;3
        
    }
}
