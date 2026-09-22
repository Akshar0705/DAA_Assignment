class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int T = 0;       
        int B = n - 1;   
        while (T < m && B >= 0) {
            int val = matrix[T][B];
            if (val == target) {
                return true;
            }
            else if (val > target) {
                B--;      
            }
            else {
                T++;                  }
        }

        return false;
    }
}