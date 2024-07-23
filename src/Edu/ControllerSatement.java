package Edu;

public class ControllerSatement {
    public static void main(String[] args) {
        // *제어문

        // 1. if문
        if(true) {
            // 처리 코드
        } else if (true) {
            // 처리 코드
        } else {
            // 처리 코드
        }

        // 2. switch문
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                // break; // default는 break를 생략해도 됨
        }

        // 3. for문
//        for(int i = 0; i < 3; i++) {
//            if ( i == 1) {
//                break;
//            }
//            System.out.println(i);
//        }

        // 4. while문
        // 5. do_while문


        // ex) 구구단 출력
        for(int i = 2; i <= 9; i++) {
            System.out.printf("%n** %d단 **%n", i );
            for (int j = 1; j <= 9; j++) {
            System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }

        // ex) 별
        for(int i = 1; i <= 5; i++) {
            System.out.printf("%s%s%n", " ".repeat(5-i), "*".repeat(i));
        }
        // sol) 별
        int cnt = 5;
        for(int i = 0; i < cnt; i++) {
            for(int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ex) 삼각형
        int cnt2 = 3;
        for(int i = 0; i < cnt2; i++) {
            for(int j = i; j < (cnt2 - 1); j++) {
                System.out.print("+");
            }
//            for(int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            for(int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
