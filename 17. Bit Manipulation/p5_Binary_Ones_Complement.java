public class p5_Binary_Ones_Complement {
    
    public static void main(String[] args) {
        
        int A =  5 ;    // 0101

        // ~0 = 1
        // ~1 = 0 
        // This operator work on single variable and it is also known as NOT oprator

        int NOT = ~A ;  // ~0101 = 010(2)

        // 5 = 00000101 => 11111010 => (11111010(one complement) = 00000101) => (00000101 +1 = 00000110)(it is known as 6 but we find using twos complement thats way the nubmer is negitive) => -6

        System.out.println(NOT);
    }
}