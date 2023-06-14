import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String line = br.readLine();
            String[] result = line.split(" ");
            int A = Integer.parseInt(result[0]);
            int B = Integer.parseInt(result[1]);
            bw.write(Integer.toString(A+B));
            bw.newLine();
        }
        bw.flush();
    }
}