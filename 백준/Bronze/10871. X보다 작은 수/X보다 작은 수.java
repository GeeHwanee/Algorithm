import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line = br.readLine();
            String[] result = line.split(" ");
            int N = Integer.parseInt(result[0]);
            int X = Integer.parseInt(result[1]);
            line = br.readLine();
            result = line.split(" ");
            for (int i = 0; i < N; i++) {
                if (Integer.parseInt(result[i]) < X) {
                    System.out.print(result[i]+" ");
                }
            }


    }
}