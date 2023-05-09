public class pattern6 {
    public static void butterfly(int n){
        //1st half
        for (int i = 1; i <=n; i++) {
            //Stars->i + spaces->2*(n-i) + Stars->i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
                
            //spaces->2*(n-i)
            for (int j2 = 1; j2 <=2*(n-i); j2++) {
                System.out.print(" ");
                
            }

            for (int j2 = 1; j2 <=i; j2++) {
                System.out.print("*");
            }
            System.out.println();
                
            

            
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
                
            //spaces->2*(n-i)
            for (int j2 = 1; j2 <=2*(n-i); j2++) {
                System.out.print(" ");
                
            }

            for (int j2 = 1; j2 <=i; j2++) {
                System.out.print("*");
            }
            System.out.println();

            
        }

    }
    public static void main(String args[]){
        butterfly(8);
    }
    
}
