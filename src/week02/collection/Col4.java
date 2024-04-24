package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add(추가), peek(조회), poll(제거하면서 조회)
        // Queue : 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>(); // Queue를 선언 + 생성

        intQueue.add(3);
        intQueue.add(10);
        intQueue.add(88);

        while(!intQueue.isEmpty()) {
            System.out.println(intQueue.poll()); // 조회 - 처음 저장했던 것 순서대로 출력됨 : 최상위요소 검색하여 제거하고 반환
        }

        // 추가
        intQueue.add(77);
        intQueue.add(10);
        intQueue.add(2);

        // peak 조회
        System.out.println(intQueue.peek()); // 최상위요소 한개 조회
        System.out.println(intQueue.size()); // 길이 조회


    }
}
