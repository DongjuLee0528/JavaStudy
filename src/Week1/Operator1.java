package Week1;

import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= 5;
        int b = 2;

        int sum = a+b;
        System.out.println("a + b = " + sum);
        int diff = a - b;
        System.out.println("a - b = " + diff);
        int multi = a * b;
        System.out.println("a * b = " + multi);
        int div = a / b;
        System.out.println("a / b = " + div);
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
