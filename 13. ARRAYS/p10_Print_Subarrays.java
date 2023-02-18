public class p10_Print_Subarrays {

    // this code is writen by Priyanshu Gour
    
    public static void Print_Subarrays(int arr[]){

        int total = 0 ; 
        for(int i = 0 ; arr.length >= i ; i++){

            for(int j = i ; arr.length > j ; j++){

                System.out.print("(");
                for(int k = i ; j >= k ; k++){
                    System.out.print(arr[k]+",");
                }
                total++;
                System.err.print(")");
            }

            System.out.println();
        }

        System.out.println("Total SubArray is : "+total);
    }

    public static void main(String args[]){

        int arr[] = {2,4,6,8,10};

        Print_Subarrays(arr);
    }
}
