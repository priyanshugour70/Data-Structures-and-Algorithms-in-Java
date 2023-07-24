
public class p12_MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 5, 9 },
                { 8, 3, 7 },
                { 2, 6, 4 }
        };

        int maxElement = findMaxElement(arr);

        System.out.println("The maximum element in the 2D array is: " + maxElement);
    }

    public static int findMaxElement(int[][] arr) {
        int maxElement = arr[0][0]; // Assuming the array is not empty

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }
            }
        }

        return maxElement;
    }
}
