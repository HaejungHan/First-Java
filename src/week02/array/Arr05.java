package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char / 1byte), 문자열 (String)
        // String  = char[] 문자열은 문자의 배열로 만든것

        // [기본형 변수 vs 참조형 변수]
        // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
        //  - Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장한 후에 그 주소를 저장함 ( = 주소형 변수)

        // char < String : char 보다 String 을 더 많이 사용한다 그 이유는 String이 가지고 있는 기능이 더 많기 때문에
        // Wrapper class와도 비슷하다-> 기본형 변수가 가지고 있는 기능이 제한되있음 -> 다양한 기능을 제공하는 Wrapper을 감싸므로써, 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length(); // 문자열 길이
        System.out.println(strLength);
        System.out.println("-----------------------");

        // (2) charAt(int index)
//        char strChar = str.charAt(1); // 문자열 안에서 한글자만 가져오기
//        System.out.println(strChar); // B

        String strKorean = "가나다라";

        char koreanChar = strKorean.charAt(1);
        System.out.println(koreanChar); // 나

        System.out.println("-----------------------");

        // (3) substring(int fromindex, in toindex)
//        String strSub = str.substring(0,3); // 인덱스 0번째 부터 인덱스 3번째 "전"까지 문자열 가져오기
//        System.out.println(strSub); // ABC


        String subStr = strKorean.substring(0, 2); // 0번째부터 2번째 전까지 지정
        System.out.println(subStr); // 가나
        System.out.println("-----------------------------");

        // (4) equals(String str) : true와 false값만 반환함
//        String newStr = "ABCD";
//        boolean strEqual = newStr.equals(str);
//        System.out.println(strEqual); // true

        String strKorean2 = "가나";

        boolean equalStr = strKorean2.equals(strKorean); // strKorean 이랑 strKorean2가 일치한지
        System.out.println(equalStr); // false

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        System.out.println(strCharArray); // {'A','B','C','D'}

        // (6) 반대로 char[] -> String
//        char[] charArray = {'A', 'B', 'C'};
//        String charArrayStr = new String(charArray);
//        System.out.println(charArray);

        char[] charArr = {'ㄱ','ㄴ','ㄷ'};

        String charToStr = new String(charArr);
        System.out.println(charToStr); // ㄱㄴㄷ
    }
}
