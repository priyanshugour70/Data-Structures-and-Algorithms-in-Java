public class p6_Descending_Bubble_Sort_Code {
    
    // this code is writen by Priyanshu Gour
    
    public static void incBubbleSort(int arr[]){
        int n = arr.length ;

        for(int i = 0 ; n-1 > i ; i++){
            for(int j = 0 ; n-1-i > j ; j++){
                if(arr[j+1] < arr[j]){

                    // Swap..

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void decBubbleSort(int arr[]){

        int n = arr.length ;

        for(int i = 0 ; n-1 > i ; i++){
            for(int j = 0 ; n-1-i > j ; j++){

                if(arr[j] < arr[j+1]){
                    // Swap ;

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        incBubbleSort(arr);
        decBubbleSort(arr);
    }
}
