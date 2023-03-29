public class p6_Binary_Left_Shift {
    
    public static void main(String[] args) {
        
        int A =  5 ;    // 000101
        int b = 2 ;

        // A << b ; (5 << 2 = 000101 << 2(All values are shifted left with 2 time and the last bits fill by zeros) => 010100 )
        
        int LeftShift = A << b  ;  // 00000101 = 00010100(20)
        // A << b ; // A << b = A * (2^b) this is formula to find leftshift

        System.out.println(LeftShift);
    }
}
