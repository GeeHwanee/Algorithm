import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            String[] result = str.split(" ");
            int[] numbers = new int[result.length];
            for (int i = 0; i < result.length; i++) {
                numbers[i] = Integer.parseInt(result[i]);
            }
            boolean isAsc = true;
            boolean isDesc = true;
            for (int i = 0; i < numbers.length; i++) {
                if(i+1!=numbers.length){
                    if(numbers[i] > numbers[i+1])
                        isAsc = false;
                    if (numbers[i] < numbers[i+1])
                        isDesc = false;
                }
            }
            if (isDesc) {
                System.out.println("descending");
            }
            if (isAsc) {
                System.out.println("ascending");
            }
            if ((!isAsc&&!isDesc)) {
                System.out.println("mixed");
            }
    }
}