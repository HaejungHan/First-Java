package week02;

public class W05 {
    public static void main(String[] args) {
        // 변수를 바로 선언해서 그 자리에서 저장하는(대입하는) 연산자
        // = (기본연산자), +=, -=, *= .....(복합대입연산자)
        // ++ : += 1
        // -- : -= 1

        // 기본 대입연산자
        int number = 10;
        number = number + 2; // 12
        System.out.println(number);

        number = number - 2; // 12 - 2 = 10
        System.out.println(number);

        number = number * 2; // 10 * 2 = 20
        System.out.println(number);

        number = number / 2; // 20 / 2 = 10
        System.out.println(number);

        number = number % 2; // 10 % 2 = 0
        System.out.println(number);
        System.out.println("--------------------------");

        // 복합 대입연산자
        number = 10;

        number += 2; // number = number + 2;
        System.out.println(number); // 12

        number -= 2; // number = number - 2;
        System.out.println(number); // 10

        number *= 2; // number = number * 2;
        System.out.println(number); // 20

        number /=2; // number = numeber / 2;
        System.out.println(number); // 10

        number %=2; // number = number % 2;
        System.out.println(number); // 0
        System.out.println("-----------------------------");

        // ++, --
        number++; // number = number + 1; -> number += 1;
        System.out.println(number); // 1

        number--; // number = number - 1; -> number -= 1;
        System.out.println(number); // 0
        System.out.println("-------------------");

        // 연습
        int num2 = 5;

        num2 += 2; // num2 = num2 + 2;
        System.out.println(num2); // 7

        num2 -= 3; // num2 = num2 - 3;
        System.out.println(num2); // 7 - 3 = 4

        num2 *= 4; // num2 = num2 * 4;
        System.out.println(num2); // 4 * 4 = 16

        num2 /= 5; // num2 = num2 / 5;
        System.out.println(num2); // 16 / 5 = 3

        num2 %= 2; // num2 = num2 % 2;
        System.out.println(num2); // 3 % 2 = 1
        System.out.println("-------------");

        int num3 = 2;

        num3++; // num3 = num3 + 1;
        System.out.println(num3); // 3

        num3--; // num3 = num3 - 1;
        System.out.println(num3); // 3 - 1 = 2
    }
}
