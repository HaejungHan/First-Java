package week02;

public class W09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;

        int z = x + y;

        long lx = 30L;
        long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(z); // 30
        System.out.println(lz); // 60
        System.out.println(fx); // 10.0
        System.out.println(fy); // 20.0
        System.out.println(fz); // 30.0

        // 연습

//        short x = 10;
//        int y = 20;
//
//        int intResult = x + y; // short보다 int가 타입이 크기 때문에 int로 변환가능
//        System.out.println(intResult); // int 타입의 30
//
//        long lx = 30L; // long타입 정의시 접미사 L꼭 붙여줄것
//        long longResult = lx + intResult; // 30 + 30
//        System.out.println(longResult); // long 타입의 60
//
//        float fx = x; // short 타입의 10 -> float타입으로 변환
//        float fy = y; // int 타입의 20 -> "
//        // float은 4byte로 long보다 byte가 작지만 부동소수점까지 가져오므로 더 큼
//        float fz = longResult; // long 타입의 60 -> float타입으로 변환
//        System.out.println(fx); // 10.0
//        System.out.println(fy); // 20.2
//        System.out.println(fz); // 60.0
    }
}
