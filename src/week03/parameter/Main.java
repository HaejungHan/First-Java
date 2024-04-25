package week03.parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        System.out.println("type = " + type); // 기존에 선언한 값 D 출력, 원본값이 변경되지 않음
        System.out.println("gear = " + car.gear); // 객체 내부에서 type을 변경했기 때문에 P 출력

        System.out.println();

        // 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호"; // 금호 타이어 객체생성

        System.out.println("tire.company = " + tire.company);

        Tire carInstanceTire = car.setTire(tire);

        System.out.println("tire.company = " + tire.company);

        System.out.println("carInstanceTire.company = " + carInstanceTire.company);
    }

}