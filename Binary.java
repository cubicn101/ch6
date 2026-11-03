import java.util.Scanner;

public class Binary {

    public static String convertToBinary(int num) {
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer QAQ ");
        int num = input.nextInt();

        System.out.println(convertToBinary(num));

     
    }
}
