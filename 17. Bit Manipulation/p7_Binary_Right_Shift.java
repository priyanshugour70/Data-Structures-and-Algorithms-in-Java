public class p7_Binary_Right_Shift {
    
    public static void main(String[] args) {
        
        int A =  6 ;    // 000110
        int b = 1 ;

        // A >> b ; (6 >> 1 = 000110 >> 1(All values are shifted right with one time and the starting bits fill by zeros) => 000011 )
        
        int RightShift = A >> b  ;  // 000101 = 000011(3)
        // A >> b ; // A >> b = A / (2^b) this is formula to find Rightshift

        System.out.println(RightShift);
    }
}
