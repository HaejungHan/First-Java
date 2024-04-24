package week02.operator;

public class W12 {
    public static void main(String[] args) {
        // 중첩 if문
//        boolean flag = true;
//        int number = 2;
//
//        if (flag) {
//            if (number == 1) {
//                System.out.println("flag 값은 true, number의 값은 1입니다.");
//            } else if (number == 2) {
//                System.out.println("flag 값은 true, number의 값은 2입니다");
//            } else {
//                System.out.println("flag 값은 true, number의 값은 알 수 없습니다.");
//            }
//        } else {
//            if (number == 1) {
//                System.out.println("flag 값은 false, number의 값은 1입니다.");
//            } else if (number == 2) {
//                System.out.println("flag 값은 false, number의 값은 2입니다");
//            } else {
//                System.out.println("flag 값은 false, number의 값은 알 수 없습니다.");
//            }
//        }
//

        // 연습
        boolean flag = false;
        int num = 4;

        if (flag) {
            // flag가 true
            if (num == 2){
                System.out.println("flag 값은 true, num의 값은 2입니다.");
            } else if (num == 3) {
                System.out.println("flag 값은 true, num의 값은 3입니다.");
            } else {
                System.out.println("flag 값은 true, num의 값은 다른 수 입니다.");
            }
        } else {
            // flag가 false
            if (num == 2) {
                System.out.println("flag 값은 false, num의 값은 2입니다.");
            } else if (num == 3) {
                System.out.println("flag 값은 false, num의 값은 3입니다.");
            } else {
                System.out.println("flag 값은 false, num의 값은 다른 수 입니다.");
            }
        }
    }
}
