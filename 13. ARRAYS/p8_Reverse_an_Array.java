public class p8_Reverse_an_Array {

    // this code is writen by Priyanshu Gour
    
    public static void Reverse_an_Array(int arr[]){

        int start = 0 ,end = arr.length-1 ;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;

            start++;
            end--;
        }


        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+", ");
        }



    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
        Reverse_an_Array(arr);
    }
}
