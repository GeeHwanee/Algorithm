import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); input.nextLine();
        int maxLength=0;
        HashSet<String> list = new HashSet<String>();
        for (int i = 0; i < T; i++) {
            String word = input.nextLine();
            list.add(word);
            if(word.length()>maxLength){
                maxLength = word.length();
            }
        }
        List<String> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList);
        List<String> realList = new ArrayList<>();
            for (int i = 1; i <= maxLength; i++) {
                for (String s: arrayList) {
                        if(s.length()==i){
                            realList.add(s);
                        }
                }
            }
        realList.forEach(System.out::println);
    }
}