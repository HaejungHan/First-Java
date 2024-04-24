package week02.array;

public class Arr03 {
    public static void main(String[] args) {

        // 얕은 복사
//        int[] a = {1, 2, 3, 4};
//        int[] b = a;
//
//        b[0] = 3;
//        System.out.println(a[0]);
//        System.out.println(a);
//        System.out.println(b);

        // 깊은복사
        int[] a = {1, 2, 3, 4};
        int[] b = new int[4];

        for (int i=0; i < a.length; i++) {
            b[i] = a[i]; // a의 인덱스 값을 복사 붙여넣기!
        }

        for (int valueB : b ) {
            System.out.println(valueB); // b = {1, 2, 3, 4}
        }
        System.out.println("-------------------------");

        b[2] = 10;
        System.out.println(a[2]); // 3
        System.out.println(b);
        System.out.println(a);


    }

}
