package week02.operator;

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // A에게 갑 입력받기
//        System.out.println("A 입력 : ");
//        String reponseA = sc.nextLine();
//
//        // B에게 값 입력받기
//        System.out.println("B 입력 : ");
//        String reponseB = sc.nextLine();
//
//        // 두 개의 값을 비교하는 메서드 -> Objects.equals(좌,우) : 좌우가 같을 경우 true, 다른 경우 false
//        if (Objects.equals(reponseA, "가위")) {
//            if (Objects.equals(reponseB, "가위")) {
//                System.out.println("A와 B는 비겼습니다.");
//            } else if (Objects.equals(reponseB, "바위")) {
//                System.out.println("B가 이겼습니다.");
//            } else if (Objects.equals(reponseB,"보")) {
//                System.out.println("A가 이겼습니다.");
//            } else {
//                System.out.println("B가 이상한 값을 입력했습니다.");
//            }
//        } else if (Objects.equals(reponseA, "바위")) {
//            if (Objects.equals(reponseB, "바위")) {
//                System.out.println("A와 B는 비겼습니다.");
//            } else if (Objects.equals(reponseB, "가위")) {
//                System.out.println("A가 이겼습니다.");
//            } else if (Objects.equals(reponseB,"보")) {
//                System.out.println("B가 이겼습니다.");
//            } else {
//                System.out.println("B가 이상한 값을 입력했습니다.");
//            }
//        } else if (Objects.equals(reponseA, "보")) {
//            if (Objects.equals(reponseB, "바위")) {
//                System.out.println("A가 이겼습니다.");
//            } else if (Objects.equals(reponseB, "가위")) {
//                System.out.println("B가 이겼습니다.");
//            } else if (Objects.equals(reponseB,"보")) {
//                System.out.println("A와 B가 비겼습니다.");
//            } else {
//                System.out.println("B가 이상한 값을 입력했습니다.");
//            }
//        } else {
//            System.out.println("A가 이상한 값을 입력했습니다.");
//        }

//        // 연습
        Scanner sc = new Scanner(System.in);

        // A에게 값 입력받기
        System.out.println("A 입력 : ");
        String responseA = sc.nextLine();

        // B에게 값 입력받기
        System.out.println("B 입력 : ");
        String responseB = sc.nextLine();

        // 두개의 값을 비교할 수 있는 메소드 Objects.equals(a,b)
        // Objects.equals(a,b) 메소드 : a/b가 같을 경우 true, a/b가 다를 경우 false
        // 경우의 수를 비교하기 위해 if 안에 if문 else if안에 if문 else안에 if문
        if (Objects.equals(responseA, "가위")) { // A가 가위 했을 때

            // 즉, reponseA가 가위를 입력했을 때 reponseB가 가위, 바위, 보 중 입력하는 값 비교
            if (Objects.equals(responseB, "가위")) {
                System.out.println("A와 B는 비겼습니다.");
            } else if (Objects.equals(responseB, "바위")) {
                System.out.println("B가 이겼습니다.");
            } else if (Objects.equals(responseB, "보")) {
                System.out.println("A가 이겼습니다.");
            } else {
                System.out.println("B는 가위,바위,보 중에서만 입력하세요.");
            }
        } else if (Objects.equals(responseA, "바위")) { // A가 바위 했을 때
            if (Objects.equals(responseB, "가위")) {
                System.out.println("A가 이겼습니다.");
            } else if (Objects.equals(responseB, "바위")) {
                System.out.println("A와 B는 비겼습니다.");
            } else if (Objects.equals(responseB, "보")) {
                System.out.println("B가 이겼습니다.");
            } else {
                System.out.println("B는 가위,바위,보 중에서만 입력하세요.");
            }
        } else if (Objects.equals(responseA, "보")) { // A가 보 했을 때
            if (Objects.equals(responseB, "가위")) {
                System.out.println("B가 이겼습니다.");
            } else if (Objects.equals(responseB, "바위")) {
                System.out.println("A가 이겼습니다.");
            } else if (Objects.equals(responseB, "보")) {
                System.out.println("A와 B는 비겼습니다.");
            } else {
                System.out.println("B는 가위,바위,보 중에서만 입력하세요.");
            }
        } else {
            System.out.println("A는 가위,바위,보 중에서만 입력하세요.");
        }



    }
}
