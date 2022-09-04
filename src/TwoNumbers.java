import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number : ");
        int number1 = input.nextInt();

        System.out.print("Second number : ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("Birinci sayi daha büyüktür.");

        } else if (number1 < number2) {
            System.out.println("Ikinci sayi daha büyüktür.");

        } else {
            System.out.println("Iki sayi esittir.");
        }

    }
}
