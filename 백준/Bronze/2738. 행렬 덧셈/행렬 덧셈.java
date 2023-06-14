import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String[] result = line.split(" ");
        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[1]);
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            line = br.readLine();
            result = line.split(" ");
            for (int j = 0; j < y; j++) {
                array[i][j] = Integer.parseInt(result[j]);
            }
        }
        for (int i = 0; i < x; i++) {
                    line = br.readLine();
                    result = line.split(" ");
                    for (int j = 0; j < y; j++) {
                        array[i][j] += Integer.parseInt(result[j]);
                    }
                }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                bw.write(array[i][j]+ " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
