package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집합 => Array(array는 최초 길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음!
        // 1) Array -> 정적배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        // - 생성 시점에 작은 연속적 공간을 요청해서 참조형 변수들을 담아놓는다.
        // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니까 상관없음

//        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

//        intList.add(99);
//        intList.add(15);
//        intList.add(3);
//
//        System.out.println(intList.get(1));

        // 연습
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(18);
        intList.add(40);
        intList.add(5);

        intList.set(1, 100);

        intList.remove(1); // 인덱스번호 1 의 값 100 삭제
        // 요소(값) 전체삭제
        intList.clear(); // 배열의 전체 값 삭제

//        System.out.println(intList.get(2)); // 5
//        System.out.println(intList.get(0)); // 18

        System.out.println(intList.toString());

        // 2번째 입력 값을 (15)를 바꿔보자
//        intList.set(1, 10);
//        System.out.println(intList.get(1));
//
//        System.out.println("-------------------------");
//        System.out.println(intList.get(0));
//
//        // 삭제
//        intList.remove(0);
//        System.out.println(intList.get(0)); // 두번째 값이 앞으로 옴
//
//        // 전체삭제
//        System.out.println("클리어 전");
//        System.out.println(intList.toString());
//        System.out.println("클리어 후");
//        intList.clear();
//        System.out.println(intList.toString()); // 직관적으로 볼 수 있게 하는 메소드

    }
}
