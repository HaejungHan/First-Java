package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
//        int[] arr = {3, 2, 1, 5, 0};
//
//        // 최대값 초기화 세팅
//        int max = arr[0];
//
//        // 최대값 구하기 로직
//        for (int num : arr) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println("최대값은 : " + max);

        // 연습

        int[] arr = {8, 4, 6, 10, 20, 0};

// 최대값 초기화 세팅
        int max = arr[0];

// 중첩 for문 + if조건문
        for (int num: arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("최대값은 : " + max); // 20

        // 최소값 구하기
        int[] arr1 = {2, 4, 6, 1, 0};

        int min = arr1[0]; // 최소값 초기화 세팅

        for (int num: arr1) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);

    }
}
