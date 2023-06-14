import java.io.*;
import java.util.*;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int index = Integer.parseInt(br.readLine());
        if ((index-1)==str.length()) {
            System.out.println(str.substring(index-1));
        }else {
            System.out.println(str.substring(index-1,index));
        }
    }
}
