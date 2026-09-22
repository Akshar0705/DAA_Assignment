import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] temp =nums1.clone();
        int index = 0;
        for(int i=0;i<m;i++) {
            nums1[index++] = nums1[i];
        }
        for(int i=0;i<n;i++) {
            nums1[index++] = nums2[i];
        }
        Arrays.sort(nums1);
    }
} 