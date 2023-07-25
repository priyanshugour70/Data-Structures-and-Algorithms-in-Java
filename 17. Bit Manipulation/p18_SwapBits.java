public class p18_SwapBits {
    public static int swapBits(int num, int i, int j) {
        // Check if the 'i-th' and 'j-th' bits are different
        int bitI = (num >> i) & 1;
        int bitJ = (num >> j) & 1;

        if (bitI != bitJ) {
            // Create masks to isolate the 'i-th' and 'j-th' bits
            int maskI = 1 << i;
            int maskJ = 1 << j;

            // Use XOR to flip the 'i-th' and 'j-th' bits
            num ^= maskI; // Flips the 'i-th' bit (0 to 1 or 1 to 0)
            num ^= maskJ; // Flips the 'j-th' bit (0 to 1 or 1 to 0)
        }

        return num;
    }

    public static void main(String[] args) {
        int num = 73; // Example input integer
        int i = 1; // Example 'i-th' bit position
        int j = 6; // Example 'j-th' bit position

        int result = swapBits(num, i, j);
        System.out.println("Result: " + result); // Output: 11 (binary representation 1011)
    }
}
