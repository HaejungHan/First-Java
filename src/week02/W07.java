package week02;

public class W07 {
    public static void main(String[] args) {
        // 기타 연산자
        // (1) 형변환 연산자
        int intNumber = 93 +(int)98.8;
        System.out.println(intNumber); // 191

        double doubleNumber = (double)93 + 98.8; // 93.0 + 98.8;
        System.out.println(doubleNumber);
        System.out.println("------------------------------------");

        // 연습
        int intResult = 92 + (int)93.3; // 92 + 93
        System.out.println(intResult); // 185

        double result2 = (double)92 + 93.3; // 92.0 + 93.3
        System.out.println(result2); // 185.3
        System.out.println("----------------------------------");

        // (2) 삼항 연산자
        // 비교연산자(true,false)와 항상 함께 쓰인다 .
        // 비교연산자의 결과: true or false -> 이 결과의 값에 따라 결정되는 무언가
        // 조건 ? 참 : 거짓
        int x = 1;
        int y = 9;

        boolean result = (x == y) ? true : false; // 1 == 9 ?
        System.out.println(result); // false

        String strResult = (x != y) ? "정답" : "오답"; // 1 != 9 ?
        System.out.println(strResult);

        int max = (x > y) ? x : y; // 1 > 9 ?
        System.out.println(max); // 9

        int min = (x < y) ? x : y; // 1 < 9 ?
        System.out.println(min); // 1
        System.out.println("---------------------------------");

        // 연습
        int x1 = 1;
        int y1 = 3;

        boolean result1 = (x1 == y1) ? true : false; // 1 = 3 ? 맞으면 true 틀리면 false
        System.out.println(result1); // false

        String strResult1 = (x1 != y1) ? "정답입니다" : "오답입니다"; // 1 != 3 ? 맞으면 정답입니다 틀리면 오답입니다.
        System.out.println(strResult1); // 정답입니다

        int max1 = (x1 > y1) ? x1 : y1; // 1 > 3 ? 맞으면 x 틀리면 y
        System.out.println(max1); // 3

        int min1 = (x1 < y1) ? x1 : y1; // 1 < 3 ? 맞으면 x 틀리면 y
        System.out.println(min1); // 1

        // (3) instance of (3주차 -> 클래스, 객체)
        // 피연산자가 조건에 명시된 클래스의 객체인지 비교하여
        // 맞으면 -> true
        // 틀리면 -> false
    }
}
