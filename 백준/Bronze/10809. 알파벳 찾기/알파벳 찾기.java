import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int[] number = new int[26];
        for (int i = 0; i < number.length; i++) {
            number[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            int c = (int)str.charAt(i);
            for (int j = 97; j <= 122; j++) {
                if (c == j&&number[c-97]==-1) {
                    number[c-97] = i;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}


