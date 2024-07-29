package Edu;

import java.util.Scanner;

public class EduString {
    public static void main(String[] args) {

        String str1 = "안녕";
        String str2 = "안녕";

        // java는 같은 문자이면 같은 주소를 사용함
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        // java의 변수지정은 참조를 하므로 "자바"를 없애지 않고 PHP로 참조를 바꾼다.
        //  -> 남은 더미 데이터는 GC(가비지)에서 상황에 따라 자동으로 삭제해준다.
        String str3 = "자바";
        str3 = "PHP";

        String str4 = "안녕하세요. 자바입니다.";
        // charAt()
        System.out.println(str4.charAt(3));

        // format()
        System.out.println(String.format("%s : 비밀번호 오류","E10"));

        // equals()
        System.out.println(str1.equals(str2));

        // length()
        System.out.println(str4.length());

        // replace()
        String tmp = str4.replace("자바", "PHP");
        System.out.println(tmp);

        // join()
        char c = 'a'; // ''로 작성
        String s = "a"; // ""로 작성
        String[] stringArr = {"자바", "PHP", "C#"};
        System.out.println(String.join("/", stringArr));

        // toLowerCase(), toUpperCase()
        String caseStr = "ASDwdd";
        System.out.println(caseStr.toUpperCase());
        System.out.println(caseStr.toUpperCase());

        // trim()
        String trimStr = "  asdf ";
        System.out.println(trimStr.trim());

        // --------------------------------------------
        // StringBuffer class / StringBuilder class
        // StringBuilder sb = new StringBuilder(66); // capacity는 여유롭게 작성
        StringBuffer sb = new StringBuffer("안녕 자바!");
        System.out.println(sb.toString());

        sb.append(" 안녕 PHP!");
        System.out.println(sb.toString());

        // *Math
        int num1 = -5;
        // 1) abs : 절대값
        System.out.println(Math.abs(num1));
        // 2) 올림
        System.out.println(Math.ceil(2.56));
        // 3) 내림
        System.out.println(Math.floor(2.56));
        // 4) 반올림
        System.out.println(Math.round(2.56));

        // ex) 1 ~ 10까지 랜덤 숫자 획듯
        System.out.println(Math.floor((Math.random()*10) + 1));
        System.out.println((int)(Math.random()*10) + 1); // 강제로 형변환 해도 된다.

        // Scanner()
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("입력하신 값은 %s입니다.", input);

    }
}
