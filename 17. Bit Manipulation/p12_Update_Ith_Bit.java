public class p12_Update_Ith_Bit {
    
    public static int setIthBit(int num , int ith){

        int ithBit = num << ith ;

        return num | ithBit ;

    }


    public static int clearIthBit(int num , int ith){

        int clrBit = num << ith ;

        clrBit = ~(clrBit) ;

        return num & clrBit ;
    }


    public static int updateIthBitSimpleMethod(int num , int ith, int newBit){

        if(newBit == 0){
            return clearIthBit(num, ith);
        }else{
            return setIthBit(num, ith);
        }
    }


    public static int updateIthBitComplexMethod(int num , int ith, int newBit){

        num = clearIthBit(num, ith) ;

        int BitMask = newBit << ith ;

        return num | BitMask ;

    }

    public static void main(String[] args) {
        
        System.out.println(updateIthBitComplexMethod(10, 2, 1));
        System.out.println(updateIthBitSimpleMethod(10, 2, 1));

    }
}
