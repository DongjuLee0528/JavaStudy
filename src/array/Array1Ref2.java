package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int [] students = new int [6];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        students[5] = 40;

        for(int i = 0; i < students.length; i++){
            System.out.println((i + 1)+"번째 학생의 점수는: "+students[i]);
        }
    }
}
