package Week1;

import java.util.Scanner;

public class Week1_0920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String color = "";
        System.out.print("이름을 입력하세요:");
        name = sc.nextLine();
        System.out.print("나이를 입력하세요:");
        age = sc.nextInt();
        System.out.print("좋아하는 색깔을 입력하세요:");
        color = sc.next();
        System.out.println("안녕하세요!" + name + "님," + age + "살이시군요. 좋아하는 색깔은 " + color+"이네요!");

    }

}
