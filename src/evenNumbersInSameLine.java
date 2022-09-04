public class evenNumbersInSameLine {
    public static void main(String[] args) {

        System.out.print("Even Numbers : ");

        for (int i = 1; i <=50 ; i++) {

            if (i%2==1) continue;

            System.out.print(i);
            System.out.print("\t");

        }

    }
}
