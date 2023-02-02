public class p7_Descending_Selection_Sort_code {
    
    public static void SelectionSort(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            
            int min = i ;

            for(int j = i+1 ; arr.length > j ; j++){
                if(arr[min] > arr[j]){
                    min = j ;
                }
            }

            // Swap ... 
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp ;
        }
        printArray(arr);
    }

    public static void decSelectionSort(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){

            int max = i ; 

            for(int j = i+1 ; arr.length > j ; j++){
                if(arr[max] < arr[j]){
                    max = j ;
                }
            }

            // Swap .....
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp ;
        }
        printArray(arr);
    }


    public static void printArray(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};


        SelectionSort(arr);
        decSelectionSort(arr);
    }
}