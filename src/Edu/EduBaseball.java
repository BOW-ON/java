package Edu;

import java.util.*;

public class EduBaseball {
    public static void main(String[] args) {
        // 원래 Math에 random 메소를 활용하여 랜덤 숫자를 얻을려고 했지만
        // 중복이 제거가 필요했기 때문에 0 ~ 9 까지 배열에 담고 섞은 뒤에 하나씩 뽑아오는 걸로 수정함

        // 0부터 9까지의 숫자를 리스트에 담기
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        // 리스트를 섞기
        Collections.shuffle(nums);
        // 섞인 리스트에서 앞의 4개 숫자 선택 후 배열에 담아두기
//        int num1 = nums.get(0);
//        int num2 = nums.get(1);
//        int num3 = nums.get(2);
//        int num4 = nums.get(3);

        // 뽑은 숫자 4개를 배열에 담아 두기
        List<Integer> bsNum = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            bsNum.add(nums.get(i));

        }
//        bsNum.add(num1);
//        bsNum.add(num2);
//        bsNum.add(num3);
//        bsNum.add(num4);
        // (정답) 랜덤 4자리 숫자 배열 결과 출력
        // System.out.println(bsNum);

        // 입력 값 받기
        System.out.println("** 야구게임 시작 **");
        System.out.println("4자리 숫자를 작성하면 아래와 같이 판별합니다. (중복 숫자 없음)");
        System.out.println(" - 자리와 숫자가 모두 같은 경우 : S");
        System.out.println(" - 숫자만 같은 경우 : B");
        System.out.println(" - 자리와 숫자 모두 다른 경우 : O");

        Scanner bsSc = new Scanner(System.in);
        String input;
        String regex = "^[0-9]{4}$"; // 4자리 숫자에 대한 정규 표현식

        // 입력 값 판별
        while (true) {
            System.out.println("아래 4자리 숫자를 입력해주세요.");
            input = bsSc.nextLine();

            // 정규 표현식 검사
            if (!input.matches(regex)) {
                System.out.printf("입력하신 값은 %s입니다. 4자리 숫자만 입력해주세요.\n", input);
                continue;
            }

            // 중복 검사
            if (hasDuplicates(input)) {
                System.out.printf("입력하신 값은 %s입니다. 중복 숫자는 허용되지 않습니다.\n", input);
                continue;
            }

            // 입력받은 숫자를 한 자리씩 분리하여 비교
            int sCount = 0;
            int bCount = 0;

            for (int i = 0; i < 4; i++) {
                int digit = Character.getNumericValue(input.charAt(i));
                if (bsNum.contains(digit)) {
                    if (bsNum.get(i) == digit) {
                        sCount++; // 자리와 숫자가 모두 같은 경우
                    } else {
                       bCount++; // 숫자만 같은 경우
                    }
                }
            }

            int oCount = 4 - sCount - bCount; // 자리와 숫자가 모두 다른 경우

            // 결과 출력
            System.out.println("결과: " + sCount + "S " + bCount + "B " + oCount + "O");

            // 4S가 나오면 게임 종료
            if (sCount == 4) {
                System.out.println("축하합니다! 모든 숫자를 맞췄습니다.");
                break;
            }
        }

    }

    // 중복 검사 함수
    private static boolean hasDuplicates(String input) {
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.add(c)) {
                return true;
            }
        }
        return false;
    }
}
