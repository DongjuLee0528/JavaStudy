package Week1;

import java.util.Scanner;

public class Switch_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("너의 점수는?? ");
        int num = sc.nextInt();
        System.out.print("학점은 ");
        if(num >= 90) {
            System.out.print("A");
        }
        else if(num >= 80) {
            System.out.print("B");
        }
        else if(num >= 70) {
            System.out.print("C");
        }
        else if(num >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
        System.out.println("입니다.");
    }
}
