package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        int[][] array = new int[2][3]; // 최초 선언

        for (int i=0; i < array.length; i++) { // 2개의 행
            for (int j=0; j < array[i].length; j++) { // 3개의 열
                System.out.println("[" + i + "]" + "[" + j + "]");
                array[i][j] = 0;
            }
        }
    }
}
