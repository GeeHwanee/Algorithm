import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt(); scanner.nextLine();
        int N = scanner.nextInt(); scanner.nextLine();
        int a=0;
        for (int i=0;i<N;i++){
            String str = scanner.nextLine();
            String[] result = str.split(" ");
            a+= (Integer.parseInt(result[0])*Integer.parseInt(result[1]));
        }
        if(X==a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
