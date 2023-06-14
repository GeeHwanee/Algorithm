import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1*(num2%10));
        System.out.println(num1*(((num2%100)/10)));
        System.out.println(num1*(((num2%1000)/100)));
        System.out.println(num1*num2);
    }
}