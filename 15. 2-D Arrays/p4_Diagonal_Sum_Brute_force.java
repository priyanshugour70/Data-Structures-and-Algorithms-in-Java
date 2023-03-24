public class p4_Diagonal_Sum_Brute_force {
    
    // this code is written by Priyanshu Gour

    public static void diagonalSum(int arr[][]){

        int sumRight = 0 , sumLeft = 0 ;

        for(int i = 0 ; arr.length > i ; i++){

            for(int j = 0 ; arr[i].length > j ; j++ ){

                if(i == j ){
                    sumRight += arr[i][j] ;
                }
                if(i + j == arr.length-1 && i != j){
                    sumLeft += arr[i][j] ;
                }

            }
        }

        System.out.println("Right Sum is :- "+sumRight);
        System.out.println("Left Sum is :- "+ sumLeft);
    }


    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        diagonalSum(matrix);
    }
}
