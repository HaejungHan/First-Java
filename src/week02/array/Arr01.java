package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArr = new int[4]; // {0, 0, 0}
        boolean[] boolArr = new boolean[4]; // {false, false, false, false}
        String[] strArr = new String[2]; // {null, null} -> {"", ""}

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArr2;
        intArr2 = new int[2]; // {0, 0}

        // 생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회
        // (1) 단건 조회
        System.out.println(intArr[1]);
        System.out.println(boolArr[2]); // {false, false, false(요놈)}
        System.out.println(strArr[1]);
        System.out.println("---------------------------");

        // (2) 다건 조회
        for (int i = 0; i < intArr.length; i++) { // .length : 길이를 구하는 메서드
            System.out.println(intArr[i]); // [i] 인덱스 값
        }
    }
}
