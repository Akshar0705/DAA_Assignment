class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        double median = 0;
        int index = 0;
        for(int i=0;i<nums1.length;i++) {
            ans[index++] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++) {
            ans[index++] = nums2[i];
        }
        Arrays.sort(ans);
        int n = ans.length;
        if(n%2!=0) {
            int num = n/2;
            median = ans[num];
        }
        else {
            int num = (n/2);
            median = (ans[num-1]+ans[num]) / 2.0;
        }
        return median;
    }
}