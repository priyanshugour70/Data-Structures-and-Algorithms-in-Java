public class p2_Binary_AND {
    
    public static void main(String[] args) {
        
        int A =  5 ;    // 0101
        int B =  6 ;    // 0110

        // 0 & 0 : 0 
        // 0 & 1 : 0 
        // 1 & 0 : 0 
        // 1 & 1 : 1

        int And = A & B ;  // 0101 & 0110 = 0100(4)

        System.out.println(And);
    }
}
