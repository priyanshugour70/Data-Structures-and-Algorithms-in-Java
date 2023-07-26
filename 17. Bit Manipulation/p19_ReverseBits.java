public class p19_ReverseBits {
    public static int reverseBits(int num) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Left shift the result to make space for the next bit
            result |= num & 1; // Get the least significant bit of num and set it in result
            num >>= 1; // Right shift num to get the next bit
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 43261596; // Example input, the binary representation is 00000010100101000001111010011100
        int reversed = reverseBits(num);
        System.out.println("Reversed: " + reversed); // Output: 964176192 (binary representation
                                                     // 00111001011110000010100101000000)
    }
}
