package week02.operator;

public class W04 {
    // 논리연산자
    // 비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
    // 조건을 연결 하였을 때 boolean 값들을 조합하여 참(true) 또는 거짓(false) 값인 boolean 값을 출력
    // &&(AND), ||(OR), !(NOT)
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println("----------------------------------");

        // (1) 피연산자 중 하나라도 true이면 true -> 또는 (OR : ||)
        System.out.println(flag1 || flag2); // true
        System.out.println(flag1 || flag2 || flag3); // true
        System.out.println("-----------------------------------");

        // (2) 피연산자가 모두 true이면 true -> 그리고 (AND : &&)
        System.out.println(flag1 && flag2); // true
        System.out.println(flag1 && flag2 && flag3); // 하나라도 false가 존재하기에 false
        System.out.println("-------------------------------------");

        // (3) AND
        System.out.println((5 > 3) && (3 > 1)); // true && true -> true
        System.out.println((5 > 3) && (3 < 1)); // true && false -> false
        System.out.println("-------------------------------------");

        // (4) OR
        System.out.println((5 > 3) || (3 > 1)); // true || true -> true
        System.out.println((5 > 3) || (3 < 1)); // true || false -> true
        System.out.println((5 > 3) || (3 < 1)); // true || false -> true
        System.out.println((5 < 3) || (3 < 1)); // false || false -> false
        System.out.println("-------------------------------------");

//        System.out.println(1 < 3 < 5); 불가능

        // (5) 논리 부정연산자 ( ! : NOT )
        System.out.println(!flag1); // false
        System.out.println(!flag3); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
        System.out.println("-------------------------------------");

        // 연습
        boolean a = true;
        boolean b = false;
        boolean c = false;

        int num1 = 3;
        int num2 = 5;
        int num3 = 10;
        System.out.println((num1 > num2) && (num2 < num3));
        System.out.println((num2 > num1) && (num2 < num3));
        System.out.println(a || b || c);
        System.out.println((num1 > num2) || (num2 < num3)); // true
        System.out.println((num2 > num1) || (num2 < num3)); // true

        System.out.println("-------------------------------------");
        // ( 3 == 5 ) -> false 부정연산자 ! 소괄호 앞에 붙이면 반대인 true 출력
        System.out.println(!(num1 == num2)); // true

        num3 = 3; // num3의 값을 3으로 변경
        // (3 == 3) -> true
        System.out.println(!(num1 == num3)); // false
    }
}
