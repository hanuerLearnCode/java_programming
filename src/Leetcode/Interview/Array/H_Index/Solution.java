package Leetcode.Interview.Array.H_Index;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] case1 = {3, 0, 6, 1, 5}; // 3
        int[] case2 = {1, 3, 1, 3}; // 1
        int[] case20 = {1}; // 1
        int[] case22 = {0, 1}; // 1
        int[] case23 = {0}; // 0
        int[] case28 = {2, 1}; // 1
        int[] c29 = {3, 1, 3}; // 1
        Solution s = new Solution();
        System.out.println(s.hIndex(case1));
//        System.out.println(s.hIndex(case2));
//        System.out.println(s.hIndex(case20));
//        System.out.println(s.hIndex(case22));
//        System.out.println(s.hIndex(case23));
//        System.out.println(s.hIndex(case28));
//        System.out.println(s.hIndex(c29));
    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Count the frequency of each citation count
        for (int citation : citations) {
            // hIndex can not be larger than n
            if (citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }

        return 0;
    }
}
