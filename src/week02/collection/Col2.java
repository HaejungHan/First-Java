package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        // Linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본적 기능은 -> ArrayList와 동일하다.
        // LinkedList는 값 -> 여기저기 나누어서: 조회하는 속도가 "느리다"
        // 값을 추가하거나, 삭제할 때는 빠릅니다.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

//        linkedList.add(5);
//        linkedList.add(10);
//        linkedList.add(3);
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.get(2));
//
//        System.out.println(linkedList.toString()); // 조회할 때는 arraylist보다는 속도가 현저히 느리다.
//
//        linkedList.add(200);
//        System.out.println(linkedList.toString());
//
//        linkedList.add(2, 4); // 2번쨰 인덱스에 요소를 추가해줘
//        System.out.println(linkedList.toString());
//
//        linkedList.set(1, 100); // 10 -> 100
//        System.out.println(linkedList.toString());
//
//        linkedList.remove(1);
//        System.out.println(linkedList.toString()); // 100이 없어지면서 2번째 인덱스였던 요소가 앞으로 옴
//
//        linkedList.clear();
//        System.out.println(linkedList.toString()); // zero

        // 연습
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(7);

        linkedList.add(2, 88);

        linkedList.set(1, 49);
        linkedList.remove(1);
        linkedList.clear(); // 요소(값) 전체삭제

//        System.out.println(linkedList.get(0)); // 5

        System.out.println(linkedList.toString()); // [5, 10, 88, 7]
    }
}
