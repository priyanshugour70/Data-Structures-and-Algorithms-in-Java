
public class p11_CountNegativeNumbersInSorted2DArray {
    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int row = rows - 1; // Start from the last row
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                // All elements to the right of the current element in this row are also
                // negative
                count += cols - col;
                row--; // Move to the previous row
            } else {
                col++; // Move to the next column
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { -4, -3, -1, 1 },
                { -2, -2, 1, 2 },
                { -1, 0, 2, 3 },
                { 1, 2, 4, 5 }
        };

        int count = countNegatives(grid);
        System.out.println("Number of negative numbers in the sorted 2D array: " + count);
    }
}
