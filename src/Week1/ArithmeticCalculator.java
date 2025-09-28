package Week1;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        float a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("출력: ");
        System.out.println("덧셈: " + (a + b));
        System.out.println("뺄셈: " + (a - b));
        System.out.println("곱셈: " + (a * b));
        System.out.println("나눗셈: " + (a / b));
        
    }
}
