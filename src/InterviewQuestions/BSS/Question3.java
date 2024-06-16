package InterviewQuestions.BSS;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        long[] rs = q3.generateArray();
        System.out.println(Arrays.toString(rs));
        long avg = q3.average(rs);
        System.out.println("Avg: " + avg);
        int[] iRs = q3.search(rs, avg);
        System.out.println(Arrays.toString(iRs));
    }

    public long[] generateArray() {
        long[] nums = new long[100];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int i = 3; i < 100; i++) {
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
        }
        return nums;
    }

    public long average(long[] nums) {
        int n = nums.length;
        long total = 0;
        for (long num : nums) {
            total += num;
        }
        return total / n;
    }

    public int[] search(long[] nums, long avg) {
        int n = nums.length;
        int leftI = 0;
        int rightI = 99;
        long left = Long.MAX_VALUE;
        long right = Long.MAX_VALUE;
        long diff = 0;
        for (int i = 0; i < n; i++) {
            diff = Math.abs(nums[i] - avg);
            if (nums[i] <= avg && diff < left) {
                left = diff;
                leftI = i;
            }
            if (nums[i] >= avg && diff < right) {
                right = diff;
                rightI = i;
            }
        }
        int[] rs = new int[2];
        rs[0] = leftI;
        rs[1] = rightI;
        return rs;
    }
}
