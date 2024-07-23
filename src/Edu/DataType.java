package Edu;

public class DataType {
    public static void main(String[] args) {
        // 1. 데이터 타입
        boolean flg = true;

        byte numByte = 127; // byte 는 127까지 입력 가능
        short numShort = 32767; // short 는 32767까지 입력가능
        int numInt = 1;
        long numLong = 5L; // long 타입은 숫자 + L을 함께 작성

        double numDouble = 5.0;
        float numFloat = 5.0f; // float 타입은 숫자 + f를 함께 작성

        char enChar = 'A'; // char는 '' 로 작성
        String str = "asd"; // string은 ""로 작성

        // 2. 연산자
        int num1 = 1;
        int num2 = 2;

        // * java는 변수를 선언할 때 데이터 타입을 지정해야 하므로 ===로 비교하는 것이 아니라 ==만 작성
        // System.out.println(num1 != num2);

        // 문자열 비교
        //  == 로 비교를 하는 것이 아니라 equals로 비교를 해야됨
        String str2 = "asd";
        String str3 = "123";
        // System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
    }
}
