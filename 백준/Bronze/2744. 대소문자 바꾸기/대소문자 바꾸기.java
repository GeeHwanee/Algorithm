import java.io.*;
import java.util.*;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }else {
                ch = Character.toLowerCase(ch);
            }
            System.out.print(ch);
        }
    }
}
