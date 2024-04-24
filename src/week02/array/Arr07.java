package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        // 가변배열
//        int[][] array = new int[3][];

//        // 배열 원소마다 각기 다른 크기로 지정
//        array[0] = new int[2];
//        // {"", ""}
//        array[1] = new int[4];
//        // {"", "", "", ""}
//        array[2] = new int[1];
//        // {""}
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);

        int[][] arr = new int[4][3]; // 4(행)x3(열)

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];
        System.out.println(arr[0].length); // 3
        System.out.println(arr[1].length); // 2
        System.out.println(arr[2].length); // 1

        // 중괄호로 초기화를 해버릴 때도 가능함
//        int[][] arr2 = {
//                {10, 20},
//                {10, 20, 30, 40},
//                {10},
//        };
        System.out.println("----------------------");
        // 연습
        int[][] arr2 = {
                {0, 1, 2, 4},
                {0, 1},
                {0, 1, 2}
        };
//        System.out.println(arr2[0].length); // 4
//        System.out.println(arr2[1].length); // 2
//        System.out.println(arr2[2].length); // 3

        // 2차원 배열 조회
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++){
                System.out.println(arr2[i][j]);
            }
        }

    }
}
