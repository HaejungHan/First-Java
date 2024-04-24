package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key-value pair ->중요
        // key라는 값으로 unique하게 보장이 되어야 함
        // Map -> HashMap, TreeMap으로 응용해서 사용할 수 있다.

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("강아지", 4);
        intMap.put("고양이", 3);
        intMap.put("햄스터", 1);
        intMap.put("햄스터", 8); // 중복 key
        intMap.put("햄스터", 9); // 중복 key

        intMap.remove("고양이"); // 중복 key

        // key 값 전체 출력(향상된 for문)
        for (String key : intMap.keySet()) { // key만 빼서 배열로 만드는 메소드
            System.out.println(key); // 중복제거되고 출력 됨
        }


        for (Integer value : intMap.values()) { // value 값만 배열로 가져오는 메소드
            System.out.println(value); // 중복제거되고 출력 됨
            // 출력 12, 11, 15 로 되는데 중복된 key을 가진 value는 맨 마지막 요소로 덮어쓰기 됨
        }

        System.out.println(intMap.get("햄스터")); // 9
    }
}
