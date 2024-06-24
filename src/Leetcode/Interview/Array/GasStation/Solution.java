package Leetcode.Interview.Array.GasStation;

public class Solution {

    public static void main(String[] args) {
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        Solution s = new Solution();
        System.out.println(s.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int nGas = gas.length;
        int nCost = cost.length;

        if (nGas != nCost) return -1;

        int gasInTank = 0;
        for (int i = 0; i < nGas - 1; i++) {
            // if not enough gas
            if (gas[i] < cost[i]) {
                gasInTank = 0;
                continue;
            }

            // update gasInTank if movable
            gasInTank = gas[i] - cost[i] + gas[i + 1];

            // reach the end and still movable ?
            if (i == nGas - 1) {
                // loop again
                for (int j = 0; j < nGas - 1; j++) {

                    // if comeback to starting point
                    if (i == j) return i;

                    //

                }
            }

        }

        return -1;
    }

}
