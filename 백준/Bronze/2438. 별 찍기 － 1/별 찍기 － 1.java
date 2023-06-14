import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        String star = "*";
        for (int i = 1; i <= result; i++) {
            System.out.println(star.repeat(i));
        }
    }
}