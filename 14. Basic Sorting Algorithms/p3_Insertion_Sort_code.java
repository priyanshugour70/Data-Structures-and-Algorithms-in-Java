public class p3_Insertion_Sort_code {
    

    public static void InsertionSort(int arr[]){

        int n = arr.length ; 

        for(int i = 1 ; n > i ; i++){
            int temp = arr[i];
            int j = i-1 ;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp ; 
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3,2,5,4,1};

        InsertionSort(arr);
        printArray(arr);

    }
}
