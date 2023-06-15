import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            boolean run = true;
            while (run) {
                if(Integer.parseInt(str)==0){
                    run = false;
                    break;
                }
                String[] result = str.split("");
                int[] numbers = new int[str.length()];
                for (int i = 0; i < result.length; i++) {
                    numbers[i] = Integer.parseInt(result[i]);
                }
                boolean isPalindLom = true;
                int max = numbers.length - 1;
                for (int i = 0; i <= max; i++) {
                    if (numbers[i] != numbers[max - i]) {
                        isPalindLom = false;
                    }
                }
                System.out.println(isPalindLom ? "yes" : "no");
                str= input.nextLine();
            }
    }
}