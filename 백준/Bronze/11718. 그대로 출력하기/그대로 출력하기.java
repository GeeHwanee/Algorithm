import java.io.*;
import java.util.*;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        while ((data=br.readLine())!=null){
            list.add(data);
        }
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
