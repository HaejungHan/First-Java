package week02;

public class W14 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";

        // switch문
        switch (month) {
            // case ~~ 연산
            case 1:
                monthString = "1월";
                break;
            // shift + tap 으로 줄 맞춰주기
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "알수없음";
        }
        System.out.println(monthString);

        // 연습
        int monthInt = 5;
        String monthStr = "";

        switch (monthInt) {
            case 1:
                monthStr = "1월";
                break;
            case 2:
                monthStr = "2월";
                break;
            case 3:
                monthStr = "3월";
                break;
            case 4:
                monthStr = "4월";
                break;
            case 5:
                monthStr = "5월";
                break;
            case 6:
                monthStr = "6월";
                break;
            case 7:
                monthStr = "7월";
                break;
            case 8:
                monthStr = "8월";
                break;
            case 9:
                monthStr = "9월";
                break;
            case 10:
                monthStr = "10월";
                break;
            case 11:
                monthStr = "11월";
                break;
            case 12:
                monthStr = "12월";
                break;
            default:
                monthStr = "알 수 없습니다.";

        }
        System.out.println(monthStr);
        System.out.println("-------------------------------");
        int ifMonth = 11;

        if (ifMonth == 1) {
            System.out.println("1월");
        } else if (ifMonth == 2) {
            System.out.println("2월");
        } else if (ifMonth == 3) {
            System.out.println("3월");
        } else if (ifMonth == 4) {
            System.out.println("4월");
        } else if (ifMonth == 5) {
            System.out.println("5월");
        } else if (ifMonth == 6) {
            System.out.println("6월");
        } else if (ifMonth == 7) {
            System.out.println("7월");
        } else if (ifMonth == 8) {
            System.out.println("8월");
        }else if (ifMonth == 9) {
            System.out.println("9월");
        } else if (ifMonth == 10) {
            System.out.println("10월");
        } else if (ifMonth == 11) {
            System.out.println("11월");
        } else if (ifMonth == 12) {
            System.out.println("12월");
        } else {
            System.out.println("알 수 없습니다.");
        }
    }
}
