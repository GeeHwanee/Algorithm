import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] result = {};
       int index = 0;
       int A=0;
       int B=0;
            do{
                String str = input.nextLine();
                String[] AB = str.split(" ");
                A = Integer.parseInt(AB[0]);
                B = Integer.parseInt(AB[1]);
                int sum = A+B;
                index++;
                int[] newResult = new int[index];
                for (int j = 0; j < index; j++) {
                    if(j+1!=index){
                        newResult[j] = result[j];
                    }else {
                        newResult[j] = sum;
                    }
                }
                result=newResult;
            }while (A!=0&&B!=0);

       for (int i = 0; i < index; i++) {
            if (result[i] != 0) {
             System.out.println(result[i]);
            }
       }
    }
}