package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력 (4단 건너뛰기)
//        Scanner sc = new Scanner(System.in);
//        //단 입력받기
//        System.out.println("제외하고 싶은 구구단은? : ");
//        int gugudanExp = sc.nextInt();
//
//        for (int i=2; i <= 9; i++) { // 첫번째 수
//            if(i == gugudanExp){
//                continue;
//            }
//            for (int j = 1; j <=9; j++) { // 두번째 수
//                System.out.println(i + " * " + j  + " = " + (i * j));
//           }
//        }



//        for (int i=2; i <= 9; i++) { // 첫번째 수
//            if(i == 4){
//                continue;
//            }
//            for (int j = 1; j <=9; j++) { // 두번째 수
//                System.out.println(i + " * " + j  + " = " + (i * j));
//            }
//        }

        // 구구단 !
//        for (int i=2; i <= 9; i++) { // 첫번째 수
//            for (int j = 1; j <=9; j++) { // 두번째 수
//                System.out.println(i + " * " + j  + " = " + (i * j));
//            }
//        }

        // 연습 - 특정한 단만 출
        Scanner sc = new Scanner(System.in);
        //단 입력받기
        System.out.println("출력하고 싶은 구구단은? : ");
        int gugudanGet = sc.nextInt();

        for (int i=gugudanGet; i <= 9; i++) { // 첫번째 수
            for (int j = 1; j <=9; j++) { // 두번째 수
                System.out.println(i + " * " + j  + " = " + (i * j));
            }
        }
    }
}
