class Solution5 {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int firstterm = 0;
        int secondterm = 1;
        int thirdterm = 1;

        for (int i=1;i<=n;i++){
            int fourthterm = firstterm + secondterm + thirdterm;
            firstterm = secondterm;
            secondterm = thirdterm;
            thirdterm = fourthterm;
        }
        return firstterm;
        
    }
}
