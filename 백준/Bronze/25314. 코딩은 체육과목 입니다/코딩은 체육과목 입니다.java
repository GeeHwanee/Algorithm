import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        for(int i=1;i<=N/4;i++){
            result += "long ";
        }
        result += "int";
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
