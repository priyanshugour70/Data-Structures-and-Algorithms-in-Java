public class p5_Diagonal_Sum_Best_force {
    
    // this code is written by Priyanshu Gour
    
    public static void diagonalSum(int arr[][]){

        int sumRight = 0 , sumLeft = 0 ; 

        for(int i = 0 ; i < arr.length ; i++){
            sumRight += arr[i][i] ;

            if(i != arr.length - 1 - i){
                sumLeft += arr[i][arr.length - i - 1] ;
            }
        }

        System.out.println(sumRight + sumLeft);
    }

    
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        diagonalSum(matrix);
    }
}
