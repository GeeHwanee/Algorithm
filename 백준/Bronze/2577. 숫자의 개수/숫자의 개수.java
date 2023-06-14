import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int result = A*B*C;
        int[] numArray = new int[10];
        String value = String.valueOf(result);
        int length = value.length();
        for (int i = 0; i < length; i++) {
            int num =0;
            if(i+1!=length){
                num =  Integer.parseInt(value.substring(i, i+1));
            }else {
                num = Integer.parseInt(value.substring(i));
            }
            numArray[num]++;
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}