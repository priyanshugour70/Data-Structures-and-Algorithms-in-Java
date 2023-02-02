public class p2_Selection_Sort_Code {


    public static void selectionSort(int arr[]){

        int n = arr.length ;

        
        for(int i = 0 ; n > i ; i++ ){
            
            int min = i ;
            for(int j = i+1 ; n > j ; j++){
                if(arr[min] > arr[j]){
                    min = j ;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
     
    public static void printArray(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        int arr[] = { 5,9,4,1,6,8,3,7,2};

        selectionSort(arr);
        printArray(arr);

    }
}