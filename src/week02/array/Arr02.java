package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화
//        int[] intArr = {1, 2, 3};
//
//        for (int index: intArr) {
//            System.out.println(index); // 향샹된 for문에서는 인덱스 번호를 적어주지 않아도 순회함
//        }
        // 1. 배열의 특정값 대입해서 선언
//        int[] intArr = {1, 2, 3, 4, 5};;
        boolean[] boolArr = {true, false, true};

//        int[] intArr = new int[4];
        // 2. for문을 통해서 대입
//        for (int i=0; i < intArr.length; i++) {
//            intArr[i] = i + 1; // {1, 2, 3, 4, 5}
//        }
        // 다건 출력
//        for (int i=0; i < intArr.length; i++) {
//            System.out.println(intArr[i]); // {1, 2, 3, 4, 5} 순회
//        }
//        // 향상된 for문을 통해서 배열 순회
//        for (int i : intArr) {
//            System.out.println(i);
//            }

            // 연습
        // 내가 만들고 싶은 배열-> int intArr = {1, 2, 3, 4, 5, 6}
//        int[] intArr = new int[6];
//
//        for (int i=0; i < intArr.length; i++) {
//            intArr[i] = i + 1; // intArr[i] (인덱스[번호])에 i+1을 넣어줘
//        }
//
//        for (int arrIndex : intArr) {
//            System.out.println(arrIndex);
//        }
//        String[] strArr = {"a", "b", "c"};
//
//        for (String indexStrArr : strArr) {
//            System.out.println(indexStrArr);
//        }
        int[] resetArr = {10, 20, 30, 40};

        Arrays.fill(resetArr, 100);
        for (int valueResetArr : resetArr) {
            System.out.println(valueResetArr); // {100, 100, 100, 100}
        }

    }
}
