package Edu;

public class EduEnum {
    public static void main(String[] args) {
        EnumDays monday = EnumDays.MONDAY;
        // System.out.println(monday);
        // System.out.println(monday.equals(EnumDays.MONDAY))

        // ordinal을 쓰면 enum에서 지정한 상수의 순서 번호가 출력됨
        // 하지만 오류가 날 가능성이 많아서 사용하지않음
        System.out.println(monday.ordinal());

        System.out.println(EnumDays.MONDAY.getDay());

    }
}

// *final로 상수 만들기
//class FinalDaysClass {
//    public static final int MONTHDAY = 1;
//    public static final int TUESDAY = 2;
//
//}
//interface FinalDaysInterface {
//    int MONTHDAY = 1;
//    int TUESDAY = 2;
//}

// *enum으로 상수 만들기
enum  EnumDays {
    SUNDAY("일요일", 0)
    ,MONDAY("월요일", 1)
    ,TUESDAY("화요일",2)
    ,WEDNESDAY("수요일", 3);

    // 상수 문자열 저장 필드
    private final String day;
    private final int intDay;

    // 싱글톤 생성자
    private EnumDays(String day, int intDay) {
        this.day = day;
        this.intDay = intDay;

    }

    // Getter 메소드
    public String getDay() {
        return day;
    }
}

//class Enum {
//    public static final Enum SUNDAY = new Enum("일요일");
//
//    // 상수 문자열 저장 필드
//    private final String day;
//
//    // 싱글톤 생성자
//    private EnumDays(String day) {
//        this.day = day;
//    }
//
//    // Getter 메소드
//    public String getDay() {
//        return day;
//    }
//
//}



