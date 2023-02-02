public class p11_Continue_Statement {
    public static void main(String args[]){

        for(int i = 1 ; 10 >= i ; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
