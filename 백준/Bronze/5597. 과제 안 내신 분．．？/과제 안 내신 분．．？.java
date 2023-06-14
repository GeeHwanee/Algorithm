import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] task = new int[28];
        for (int i = 0; i < task.length; i++) {
            task[i]=Integer.parseInt(br.readLine());
        }
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 30;i++) {
            boolean found = false;
           for (int j = 0; j < task.length; j++) {
                if(i==task[j]){
                    found = true;
                    break;
                }
           }
            if (!found) {
                if (x != 0) {
                    y = i;
                } else {
                    x = i;
                }
            }
        }
        if(x>y){
            bw.write(y +"\n");
            bw.write(Integer.toString(x));
            bw.flush();
        }else {
            bw.write(x +"\n");
            bw.write(Integer.toString(y));
            bw.flush();
        }
    }
}
