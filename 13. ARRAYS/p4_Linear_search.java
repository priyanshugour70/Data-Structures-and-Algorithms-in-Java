import java.util.*;

// this code is writen by Priyanshu Gour

public class p4_Linear_search {

    public static void Linear_search(int arr[] ,int key){
        

        boolean issearch = false ;
        int value = 0 ;
        for(int i = 0 ; arr.length > i ; i++){
            if(key == arr[i]){
                issearch = true ;
                value = i ;
            }
        }

        if(issearch){
            System.out.print("This present in the array.. Index value is : " );
            System.out.println(value);
        }
        else{
            System.out.println("did't present in the array ..");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        Linear_search(arr, 4);
        sc.close();
        
    }
}
