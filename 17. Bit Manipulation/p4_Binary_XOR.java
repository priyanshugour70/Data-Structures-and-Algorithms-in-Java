public class p4_Binary_XOR {
    
    public static void main(String[] args) {
        
        int A =  5 ;    // 0101
        int B =  6 ;    // 0110

        // 0 ^ 0 : 0 
        // 0 ^ 1 : 1 
        // 1 ^ 0 : 1 
        // 1 ^ 1 : 0

        int XOR = A ^ B ;  // 0101 ^ 0110 = 0011(3)

        System.out.println(XOR);
    }
}