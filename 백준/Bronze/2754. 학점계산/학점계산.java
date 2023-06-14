import java.io.*;
import java.util.*;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        float result = 0;
        if (str.equals("A+")) {
            result= 4.3F;
        }else if (str.equals("A0")){
            result=4.0f;
        }else if (str.equals("A-")){
            result=3.7f;
        }else if (str.equals("B+")){
            result=3.3f;
        }else if (str.equals("B0")){
            result=3.0f;
        }else if (str.equals("B-")){
            result=2.7f;
        }else if (str.equals("C+")){
            result=2.3f;
        }else if (str.equals("C0")){
            result=2.0f;
        }else if (str.equals("C-")){
            result=1.7f;
        }else if (str.equals("D+")){
            result=1.3f;
        }else if (str.equals("D0")){
            result=1.0f;
        }else if (str.equals("D-")){
            result=0.7f;
        }
        System.out.println(result);
    }
}
