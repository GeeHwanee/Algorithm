import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(bufferedReader.readLine());
        }
       int[] newList = Arrays.stream(list).sorted().toArray();
        for (int i = 0; i < N; i++) {
            bufferedWriter.write(newList[i] +"\n");
        }
        bufferedWriter.close();
    }
}