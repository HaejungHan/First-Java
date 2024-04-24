package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // Stack
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. FILO(Basket)
        // push(추가), peek(가장 최근 저장된 요소를 반환), pop(값제거하여 반환)
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>(); // 선언 + 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때 까지 출력
        // isEmpty(): 비어있으면 true, 차있으면 false
//        while (!intStack.isEmpty()) {
//            System.out.println(intStack.pop()); // 가장 최근에 push한 값부터 제거하여 그 값을 반환
//        }

//        // 다시 추가
//        intStack.push(10);
//        intStack.push(15);
//        intStack.push(1);
//
//        // peek
        System.out.println(intStack.peek()); // 가장 최근에 저장된 것 요소만 출력
        System.out.println(intStack.size()); // 3


    }
}
