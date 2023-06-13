package _20230613;

import java.util.Scanner;

public class BJ2480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        String[] r = result.split(" ");
        int num1 = Integer.parseInt(r[0]);
        int num2 = Integer.parseInt(r[1]);
        int num3 = Integer.parseInt(r[2]);
        int money = 0;

        if(num1==num2&&num2==num3){
            money += 10000+num1*1000;
        }else if (num1 == num2||num2 == num3||num3 == num1) {
            if(num1 == num2){
            money += 1000+num1*100;
            }else if (num2 == num3) {
            money += 1000+num2*100;
            }else if (num3 == num1) {
            money += 1000+num3*100;
            }
        }else {
            if(num1>num2&&num1>num3){
                money += num1*100;
            }else if (num2>num3&&num2>num1) {
                money += num2*100;
            }else if (num3>num1&&num3>num2) {
                money += num3*100;
            }
        }
        System.out.println(money);
    }
}