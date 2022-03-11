package Average;
import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        //Write a Java program that calculates the average of 3 numbers.
        Scanner scan=new Scanner(System.in);
        double sum=0;
        System.out.println("Please enter three numbers:");
        for(int i=0;i<=2;i++){
            System.out.print("Lütfen "+(i+1)+". sayıyı giriniz:");
            int sayi= scan.nextInt();
              sum+=sayi;
        }
        System.out.print("Average:"+(sum/3));
    }
}
