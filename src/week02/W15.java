package week02;

public class W15 {
    public static void main(String[] args) {
        // for문
        // (초기값 ; 조건문 ; 증가연산)
//        for (int i = 0; i < 4; i++) {
//            System.out.println(i + "번째 출력!");
//        }
//        System.out.println("-------------------------------------");
        // 향상된 for문
        // 기존 : for문 안에 3개의 표현이 들어감 -> (초기값; 조건문; 증가연산)
        // 향상된 for문: 2개로 줄여줌
//        int[] numbers = {3, 6, 9, 12, 15};
//        for (int number: numbers) {
//            System.out.print(number + " ");
//        }

//        System.out.println("----------------------------------------");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i] + "번째 출력했어요!");
//        }

        // 연습
        int a = 5;

        for (int i=0; i < a; i++) {
            System.out.print(i + "번째 ");
        }

        int[] numArr = {2, 4, 6, 8, 10};

        for (int num: numArr) {
            System.out.print(num + " ");
        }

        String[] strArr = {"A", "B", "C", "D"};

        for (String str: strArr) {
            System.out.print(str + " ");
        }

        int[] intArr = {4, 8, 12, 16, 20};

        for (int i=0; i < intArr.length; i++) { // .length는 intArr의 배열의 길이
            System.out.print(intArr[i] + " ");
        }
        System.out.println("----------------------");

        String[] strArray = {"가", "나", "다", "라"};

        for (int i=0; i < strArray.length; i++ ) {
            System.out.print(strArray[i] + " ");
        }
    }
}
