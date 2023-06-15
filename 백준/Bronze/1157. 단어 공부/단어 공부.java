import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String str = input.nextLine().toLowerCase();
            String[] result = str.split("");
            int[] numbers = new int[26];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if(((int)(result[i].charAt(0))-97)==j)
                        numbers[j]++;
                }
            }
            int cnt=0;
            int c=0;
            int d=0;
            boolean isduplicatied = false;
            for (int i = 0; i < numbers.length; i++) {
                if(cnt<numbers[i]){
                    cnt=numbers[i];
                    c=i+97;
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if(cnt==numbers[i]){
                    isduplicatied = true;
                    d=i+97;
                }
            }
            if(isduplicatied&&c!=d){
                System.out.println("?");
            }else {
                System.out.println(Character.toUpperCase((char)c));
            }
    }
}