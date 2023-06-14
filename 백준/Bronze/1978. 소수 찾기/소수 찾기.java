import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.nextLine();
        int[] array = new int[number];
        String str = input.nextLine();
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++) {
            array[i]=Integer.parseInt(result[i]);
        }
        int find = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num==1) {
                continue;
            }
            boolean isFind = false;

            for (int j = 2; j < num; j++) {
                if (num%j==0) {
                    isFind = true;
                    break;
                }
            }
            if (!isFind) {
                find++;
            }
        }
        System.out.println(find);
    }
}


