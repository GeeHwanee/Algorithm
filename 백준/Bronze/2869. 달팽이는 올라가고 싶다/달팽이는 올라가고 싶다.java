import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] result = str.split(" ");
        int A = Integer.parseInt(result[0]);
        int B = Integer.parseInt(result[1]);
        int V = Integer.parseInt(result[2]);

        double x = (double)(V-A)/(A-B);
        System.out.println((int)(Math.ceil(x)+1));
    }
}