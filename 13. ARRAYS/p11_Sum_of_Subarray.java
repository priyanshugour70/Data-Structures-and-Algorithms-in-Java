public class p11_Sum_of_Subarray {

    // this code is writen by Priyanshu Gour
    
    public static void Sum_of_Subarray(int arr[]){

        for(int i = 0 ; arr.length > i ; i++){
            int sum = 0;

            for(int j = i ; arr.length > j ; j++){
                System.out.print("(");
                for(int k = i ; j >= k ; k++){
                    sum+= arr[k];
                }
                System.out.print(sum);
                System.out.print(")");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        Sum_of_Subarray(arr);
    }
}
