import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            String[] result = str.split(" ");
            System.out.println("Case #" + i + ": " + (Integer.parseInt(result[0]) + Integer.parseInt(result[1])));
        }
    }
}
