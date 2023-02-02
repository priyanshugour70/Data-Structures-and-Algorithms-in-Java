public class p6_Smallest_in_Array {
    public static void Smallest_in_Array(int arr[]){

        int temp = Integer.MAX_VALUE ;

        for(int i = 0 ; arr.length > i ; i++){
            if(arr[i]<temp){
                temp = arr[i] ;
            }
        }


        System.out.println("Largest Number in Arrray is :  "+temp);
    }
    public static void main(String args[]){
        int arr[] = {30,34,24,65,34,89,62,67,32,68,46,34};

        Smallest_in_Array(arr);
    }
}