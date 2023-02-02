public class p9_Pairs_in_Array {
    
    public static void Pairs_in_Array(int arr[]){

        int total_pairs = 0 ;
        for(int i = 0 ; arr.length > i ; i++){

            for(int j = i+1 ; arr.length > j ; j++ ){
                total_pairs++;
                System.out.print("("+arr[i]+","+arr[j]+")");
            }

            System.out.println();
        }

        System.out.println("Total Parirs is : "+total_pairs);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};

        Pairs_in_Array(arr);

        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
