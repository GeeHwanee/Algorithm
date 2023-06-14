import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        String[] r = result.split(" ");
        int A = Integer.parseInt(r[0]);
        int B = Integer.parseInt(r[1]);

        if (A>B){
            System.out.println(">");
        }else if(A==B){
            System.out.println("==");
        }else {
            System.out.println("<");
        }
    }
}