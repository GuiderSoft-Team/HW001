package PrintTriangle;
public class PrintTriangle {
    public static void main(String[] args) {
             System.out.print(" ");
             for(int i=0; i<2;i++){
                 for(int j=i;j<2;j++) {
                     System.out.print(" ");
                 }

                 for(int k=0;k<=i;k++){

                     System.out.print("*");
                     System.out.print("   ");
                 }
                 System.out.println();
             }
        System.out.println("*      *");
             for(int i=0;i<9;i++){
                 System.out.print("*");
             }
    }
}
