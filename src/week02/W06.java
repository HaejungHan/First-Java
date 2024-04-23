package week02;

public class W06 {
    public static void main(String[] args) {
        // 대입 연산자에서 주의해야 할 점 !!
        // ++, --

        int a = 10;
        int b = 10;
        int val = ++a + b--; // 11 + 10 = 21
        // 여기서 ++a 는 1 + 10 개념이고 b는 아직 10
        System.out.println(val); // 21
        // b--; 의 경우는 후에 - 를 한다는 개념
        System.out.println(b); // 9

        a = 10;
        b  = 10;
        val = ++a + --b; // 11 + 9 = 20
        System.out.println(val); // 20
        System.out.println("---------------");

        // 연습
        int num1 = 2;
        int num2 = 3;

        int result = ++num1 + --num2;
        // ++num1 -> num1 = num1 + 1; -> 3
        // --num2 -> num2 = num2 - 1; -> 2
        // result = 3 + 2; -> 5
        System.out.println(result); // 5
        // 변수 앞에 ++ 붙이는 경우는 바로 적용이 되지만

        num1 = 2;
        num2 = 3;
        result = ++num1 + num2--;
        // num1 = num1 + 1; -> 3
        // num2-- -> num2 = num2 -> 3
        // result = 3 + 3 -> 6
        System.out.println(result); // 6
        // 변수 뒤에 num2--; 같은 경우는 후에 적용됨
        System.out.println(num2); // 2
    }
}
