public class p3_Binary_OR {
    
    public static void main(String[] args) {
        
        int A =  5 ;    // 0101
        int B =  6 ;    // 0110

        // 0 | 0 : 0 
        // 0 | 1 : 1 
        // 1 | 0 : 1 
        // 1 | 1 : 1

        int Or = A | B ;  // 0101 | 0110 = 0111(7)

        System.out.println(Or);
    }
}
