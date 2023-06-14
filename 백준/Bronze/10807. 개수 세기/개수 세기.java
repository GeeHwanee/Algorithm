import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            String  line = br.readLine();
            String[] result = line.split(" ");
            int v = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (Integer.parseInt(result[i])==v) {
                    cnt++;
                }
            }
        System.out.println(cnt);

    }
}