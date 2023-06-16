import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); scanner.nextLine();
        String str = scanner.nextLine();
        String[] result = str.split(" ");
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i=0; i< N;i++){
            int num = Integer.parseInt(result[i]);
            list.add(num);
            if(max<num){
                max=num;
            }
        }
        double d = 0;
        for (Integer i: list) {
            d += (double) i /max*100;
        }
        System.out.println(d/list.size());
    }
}
