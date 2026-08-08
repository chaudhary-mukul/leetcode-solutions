package arrays;

/*
 * LeetCode 73 - Set Matrix Zeroes
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(1)
 */

class Solution {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstColZero = false;

        // 1. Use first row and first column as markers.
        for (int i = 0; i < rows; i++) {

            if (matrix[i][0] == 0) {
                firstColZero = true;
            }

            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 2. Set cells to zero using the markers.
        // Traverse bottom-to-top so that matrix[0][j]
        // is not destroyed before we use it.
        for (int i = rows - 1; i >= 0; i--) {

            for (int j = cols - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            // Handle first column separately.
            if (firstColZero) {
                matrix[i][0] = 0;
            }
        }
    }
}