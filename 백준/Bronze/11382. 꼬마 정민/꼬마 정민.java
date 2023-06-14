import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String[] result = a.split(" ");
        Long num1 = Long.parseLong(result[0]);
        Long num2 = Long.parseLong(result[1]);
        Long num3 = Long.parseLong(result[2]);
        System.out.println(num1+num2+num3);
    }
}