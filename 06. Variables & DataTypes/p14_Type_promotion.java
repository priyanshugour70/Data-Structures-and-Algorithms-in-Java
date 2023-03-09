public class p14_Type_promotion {

    // This Code is Written By Priyanshu Gour

    
    public static void main(String args[]){

        /*
         * 1. Javaa automatically promotes each byte, short, or char operand to int when evaluting an expression.
         * 2. If one operand is long, float or double the whole expression is promoted to long, float, or double respectively...
         */

         char a = 'A';
         char b = 'B';

         System.out.println(a+b);

         int w = 10 ;
         float x = (float)20.25; 
         double y = 25 ;
         long z = 23 ;

         //int ans = w + x + y + z ; // not promotion because int is lower then uses datatypes.........
         
         int ans = (int) (w + x + y + z) ; 
         
         System.out.println(ans);
         
         

        /*


         //wrong 
         byte h = 5 ; 
         h = h*2;

         
         // right
         byte i = 5 ;
         i = (byte) (b*2);

        
         */

    }
}
