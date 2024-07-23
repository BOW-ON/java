package Edu;

public class EduClass {
    public static void main(String[] args) {
        // Whale whale = new Whale(); // Whale 타입의 Whale 객체를 인스턴스하여 whale에 담아두고 사용
        // System.out.println(whale.age);
        // System.out.println(whale.info());
        // System.out.println(whale.info(32));
        
        // System.out.println(Whale.name); // 인스턴스 없이 바로 'class명.인스턴스변수'로 작성해도 됨

        // Test test = new Test();
        // System.out.println(test.i); // Test클래스에 접근 제어 지시자 없이 default로만 지정했기때문에 다른 곳에서 사용 불가
        // System.out.println(test.j);
    }
}

//class Whale{
//    public int age = 32; // 인스턴스 변수
//    public static String name = "고래";
//
//    public String info() {
//        int i = 3; // 지역 변수
//        return "고래입니다.";
//    }
//    // 오버로딩 : info 메소드를 작성하고 인수(Argument)를 받으면 동일한 info 메소드를 또 사용할 수 있다.
//    public String info(int age) {
//        return age + "살 고래입니다.(오버로딩)";
//    }
//}