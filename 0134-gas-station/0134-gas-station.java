class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        for(int i=0; i<gas.length;i++){
            totalGas += gas[i] - cost[i];
        }

        if(totalGas < 0) return -1;

        int res = 0;
        int remGas = 0;

        for(int i=0; i<gas.length;i++){
            remGas += gas[i] - cost[i];

            if(remGas < 0) {
                remGas = 0;
                res = i + 1;
            }

        }
        return res;
    }
}