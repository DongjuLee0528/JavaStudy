package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[] [] arr = new int[2][3];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;

        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 2;
        for (int row = 0; row < 2; row++) {
            System.out.print(arr[row][0]+ "");
            System.out.print(arr[row][1]+ "");
            System.out.print(arr[row][2]+ "");
            System.out.println();
    }

    }
}
