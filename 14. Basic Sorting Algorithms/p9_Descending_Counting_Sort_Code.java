public class p9_Descending_Counting_Sort_Code {
    

    public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE ;

        for(int i = 0 ; arr.length > i ; i++){
            largest = Math.max(largest , arr[i]);
        }

        int Aux[] = new int[largest + 1];

        for(int i = 0 ; Aux.length > i ; i++){
            Aux[i] = 0 ; 
        }

        for(int i = 0 ; arr.length > i ; i++){
            Aux[arr[i]]++;
        }

        int j = 0 ; 
        for(int i = 0 ; Aux.length > i ; i++){

            while(Aux[i] > 0){
                arr[j] = i ;
                j++;
                Aux[i]--;
            }
        }
        printArray(arr);
    }


    public static void decCountingSort(int arr[]){

        int largest = Integer.MIN_VALUE ;

        for(int i = 0 ; arr.length > i ; i++){
            largest = Math.max(largest, arr[i]);
        }

        int Aux[] = new int[largest + 1];

        for(int i = 0 ; Aux.length > i ; i++){
            Aux[i] = 0;
        }

        for(int i = 0 ; arr.length > i ; i++){
            Aux[arr[i]]++;
        }

        int j = arr.length-1 ; 

        for(int i = 0 ; Aux.length > i ; i++){
            
            while(Aux[i] > 0 ) {
                arr[j] = i ;
                j--;
                Aux[i]--;
            }
        }

        printArray(arr);
    }


    public static void printArray(int [] arr){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){

        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        countingSort(arr);
        decCountingSort(arr);
    }
}
