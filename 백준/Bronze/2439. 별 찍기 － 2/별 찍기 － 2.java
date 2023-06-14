import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String star = "*";
        for (int i = 1; i <= num; i++) {
            System.out.printf("%s%s\n"," ".repeat(num-i),star.repeat(i));
        }
    }
}