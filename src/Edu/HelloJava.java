package Edu;

public class HelloJava {
    public static void main(String[] args) {
        // 1. 변수 - 변수의 타입을 꼭 지정해야됨.
        int num = 1;
        // string name = "자바";

        // 2. 상수
        final int num2 = 200_000; // 언더스코어 표기법 : 숫자의 단위가 클 경우 _로 구분해도 숫자로 인식함
        // num2 = 1;  // 상수이므로 재할당 불가

        // 3. 스왑
        int swap1 = 10;
        int swap2 = 30;
        int tmp;

        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 4. 출력
        // System.out.println("Hello 자바");
        System.out.println(swap1);
        System.out.println(swap2);
        System.out.printf("swap1 : %d, swap2 : %d%n", swap1, swap2);

    }
}
