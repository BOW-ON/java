package Edu.InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        // 내부클래스 인스턴스 하는 방법
        Mammal mammal = new Mammal(); // 먼저 외부 클래스 먼저 인스턴스한 뒤
        Mammal.Whale whale = mammal.new Whale(); // 내부 클래스를 인스턴스 한다.
        whale.info();

        // +) 한줄로 인스턴스 하는 방법
        Mammal.Whale whale2 = new Mammal().new Whale();
        whale2.info();
    }
}

// 외부 클래스 - Mammal
class Mammal {
    String birth = "출산";

    // 내부 클래스 - Whale
    class Whale {
        String name = "고래";
        String color = "회색";

        // 자바 언어 사양상 컴파일 에러 발생
        // 주의 : 컴파일러에 따라 특정 설정하에 동작할 수도 있으나, static 사용하지 않기
        static int age = 18;

        public void info() {
            // 내부 클래스 특성상 super와 this 없이도 바로 사용할 수 있다.
            System.out.println(color);
            System.out.println(name);
            System.out.println(birth);
        }


    }

}