public class p3_Parameters_and_Arguments {
    
    public static int calsum(int a , int b){  // Parameters or Formal parameters..

        int sum = a + b ;  
        return sum ;
    }

    public static void main(String args[]){
        
        int x = 32 ;
        int y = 43 ; 

        int addtion = calsum(x,y);  // arguments or actual parameters..

        System.out.println(addtion);
    }
}
