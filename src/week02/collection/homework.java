package week02.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력값 받기
        // 자료구조명, 요리제목 입력
        String struc = sc.nextLine();
        String recipeTitle = sc.nextLine();
        // 요리순서 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 반복
        // 순번 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 반복
        // 반복문 3개 필요 switch 자료구조명 (조건문) while 요리순서 (반복문), for문을 통해서 순번 (반복문)

        switch (struc) {
            case "List":
                ArrayList<String> cookArr = new ArrayList<String>(); // cookArr 배열 선언 + 생성
                while (true) { // while이 true일 때 동안 반복해줘
                    String cookList = sc.nextLine(); // cookList는 cookArr의 배열에 입력될 값
                    if (cookList.equals("끝")) { // cookList의 입력값 중 끝 이라는 문구가 나오면
                        break; // 종료해줘
                    }
                    cookArr.add(cookList); // cookArr에 cookList값을 추가
                }
                System.out.println("[ "+ struc + "으로 저장된" + recipeTitle + " ]"); // 제목 출력
                for (int i = 0; i < cookArr.size(); i++) { // cookArr의 컬렉션 목록 길이순회
                    int num1 = i + 1; // 순번 1번부터 출력을 위해 +1
                    System.out.println(num1 + ". " + cookArr.get(i)); // 순번 출력 , cookArr i번째 데이터 값 조회
                } break;
            case "Map":
                Map<Integer, String> cookMap = new HashMap<Integer, String>(); // cookMap 선언 + 생성
                int key = 1; // key 값 초기화
                while (true) { // true일 동안 반복해줘
                    String cookstr = sc.nextLine(); // cookstr은 cookMap 입력될 값
                    if(cookstr.equals("끝")) { // cookstr 데이터 값 중 끝 이라는 문구가 나오면
                        break; // 종료 탈출!
                    }
                    cookMap.put(key, cookstr); // cookMap에 num2(key값)에 cookstr(value값)을 추가
                    key++; // key값 + 1
                }
                System.out.println("[ "+ struc + " 으로 저장된 " + recipeTitle + " ]"); // 제목 출력

                for (int i = 0; i < cookMap.size(); i++) {
                    int num2 = i + 1; // num2가 1번 부터 시작할 수 있게 설정
                    System.out.println(num2 + ". " + cookMap.get(num2)); // num2 -> 순번 / key 값
                } break;
            default:
                System.out.println("자료구조명을 잘못 입력하셨습니다.");
        }

    }
}
