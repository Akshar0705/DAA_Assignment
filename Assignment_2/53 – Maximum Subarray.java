import  java.util.*;;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int left = 0;
        int currentsum = 0;
        for(int i=0;i<nums.length;i++) {
            currentsum += nums[i];
            if(currentsum > sum) {
                sum = currentsum;
            }
            if(currentsum<0) {
                currentsum = 0;
                left = i+1;
            }
        }
        return sum;
    }
}