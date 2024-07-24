package Edu;

public class EduException {
    public static void main(String[] args) {
        // 예외 처리
        try {
            // 강제 예외 발생 시키기
            throw new Exception("강제 에러");

            // System.out.println("트라이 블럭");
            // double result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 예외");
        } catch (Exception e) {
            System.out.println("캐치 블럭");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("파이널 블럭");
        }
    }
}
