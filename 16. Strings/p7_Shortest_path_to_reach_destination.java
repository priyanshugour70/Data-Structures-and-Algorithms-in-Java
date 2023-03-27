public class p7_Shortest_path_to_reach_destination {
    
    public static float sortestPath(String str){
        int x = 0 , y = 0 ;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'W'){
                x-- ;
            }else if(str.charAt(i) == 'N') {
                y++ ;
            }else if(str.charAt(i) == 'S'){
                y-- ;
            }else{
                x++ ;
            }
        }

        int x2 = x*x ;
        int y2 = y*y ;

        return (float)Math.sqrt(x2 + y2) ;
    }

    public static void main(String[] args) {
        
        String path = "WNEENESENNN" ;

        float dist = sortestPath(path);

        System.out.println(dist);
    }
}
