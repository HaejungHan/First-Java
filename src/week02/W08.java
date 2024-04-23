package week02;

public class W08 {
    public static void main(String[] args) {
        // 연산자 우선순위 : 산술 > 비교 > 논리 > 대입
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // 비교 > 논리  비교우선 2 < 9 &&(AND) 9 < 10
        System.out.println(result); // true
        System.out.println("--------------------------------------");

        result = x + 10 < y && y < z; // 산술 > 비교 > 논리  +우선계산 12 < 9 (false) &&(AND) 9 < 10 (true)
        System.out.println(result); // false
        System.out.println("-------------------------------------");

        result = x + 2 * 3 > y; // 산술 > 비교  *우선계산 8 > 9
        System.out.println(result); // false
        System.out.println("-------------------------------------");

        result = (x + 2) * 3 > y; // 산술 > 비교 소괄호계산우선  12 > 9
        System.out.println(result); // true
        System.out.println("--------------------------------------");

        // 연습
        x = 5;
        y = 10;
        int i = 12;

        // 비교 > 논리
        boolean result1 = x < y && y < i; // 5 < 10 (true), 10 < 12(true) -> true && true
        System.out.println(result1); // true

        // 산술 > 비교 > 논리
        result1 = x > y + 10 && y < i; // y + 10 = 20 , 5 > 20 (false), 10 < 12 (true)
        System.out.println(result1); // false

        // 산술 > 비교
        result1 = x + 10 * 2 > y; // 10 * 2 = 20 -> 20 + x = 25 -> 25 > y
        System.out.println(result1); // true

        // 산술 > 비교 (소괄호 우선)
        result1 = x < (y + 2) * 3; // (y + 2) = 12 -> 12 * 3 = 36 -> 5 < 36
        System.out.println(result1); // true
    }
}
