package Leetcode.Interview.Array.MajorityElement;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        System.out.println(Solution.majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        /**
         * BOYER-MORE VOTING ALGORITHM
         */

        int l = nums.length;
        int major = nums[0];
        int appearance = 1;

        for (int i = 1; i < l; i++) {
            // if the current number has not been seen before
            if (appearance == 0) {
                // set the major to be that number
                major = nums[i];
                // increase the appearance of that number by 1
                appearance++;
            }
            // else if that number has been seen in the array
            else if (nums[i] == major) {
                // increase the appearance
                appearance++;
            }
            // else decrease the appearance
            // to make sure that only one can be the major
            else {
                appearance--;
            }
        }


        return major;
    }

}
