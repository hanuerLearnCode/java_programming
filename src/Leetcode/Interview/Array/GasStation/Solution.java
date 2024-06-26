package Leetcode.Interview.Array.GasStation;

public class Solution {

    public static void main(String[] args) {
        int[] gas = {3, 3, 4};
        int[] cost = {3, 4, 4};
        Solution s = new Solution();
        System.out.println(s.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        int tongCacHieuGiuaGasVaCost = 0;
        int hieuGiuaGasVaCost = 0;
        int start = 0; // a starting point

        for (int i = 0; i < n; i++) {
            tongCacHieuGiuaGasVaCost += gas[i] - cost[i];
            hieuGiuaGasVaCost += gas[i] - cost[i];

            // if gas < cost
            if (hieuGiuaGasVaCost < 0) {
                hieuGiuaGasVaCost = 0; // re-assign it to be 0
                start = i + 1; // move to the next index
            }
        }


        return (tongCacHieuGiuaGasVaCost >= 0) ? start : -1;

    }

    public int canComplete(int[] gas, int[] cost) {

        int n = gas.length;

        int totalSurplus = 0, surplus = 0, start = 0;

        for (int i = 0; i < n; i++) {
            totalSurplus += gas[i] + cost[i];
            surplus += gas[i] + cost[i];

            if (surplus < 0) {
                surplus = 0;
                start = i + 1;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

}
