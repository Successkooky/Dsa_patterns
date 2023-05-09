public class pattern2 {

    //Inverted & Rotated Half-Pyramid

    public static void inverted_pyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {

                System.out.print(" ");

               
                }
                for (int j2 = 1; j2 <= i; j2++) {
                    System.out.print("*");
                    

                
            }
            System.out.println();
            
        }
        
    }

    public static void main(String args[]){
        inverted_pyramid(5);
    }
    
}
