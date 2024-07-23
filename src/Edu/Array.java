package Edu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1. int 배열
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr);

        // ex) 1 ~ 100,000의 숫자를 배열로 만들어 주세요.
        int[] arr2 = new int[100_000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            // System.out.println(arr2[i]);
        }
        // System.out.println(arr2);
        // System.out.println(Arrays.toString(arr2));

        // 2. 캐릭터 배열
        char[] arr3 = {'a', 'b', 'c'}; // 값을 넣으면서 초기화까지 할 수 있음
        System.out.println(Arrays.toString(arr3));

        // *배열 사용 주의 사항

        // 배열은 참조형이므로 발생하는 사항 > 원본이 변경됨
        // int[] arr4 = {1, 2, 3};
        // int[] arr5 = arr4;
        // arr5[1] = 43;
        // System.out.println(Arrays.toString(arr5)); // 출력 : [1, 43, 3]
        // System.out.println(Arrays.toString(arr4)); // 출력 : [1, 43, 3] // 원본이 변경됨

        // 원본이 변경 되지 않게 함
        // int[] arr4 = {1, 2, 3};
        // int[] arr5 = new int[arr4.length];
        // for (int i = 0; i < arr5.length; i++) {
        //     arr5[i] = arr4[i];
        // }
        // arr5[1] = 43;
        // System.out.println(Arrays.toString(arr5)); // 출력 : [1, 43, 3]
        // System.out.println(Arrays.toString(arr4)); // 출력 : [1, 2, 3] // 원본은 변경되지 않음

        // 성능을 높이기 위해 for문을 사용하지 않고 배열 복사를 함
        int[] arr4 = {1, 2, 3};
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        arr5[1] = 43;
        System.out.println(Arrays.toString(arr5)); // 출력 : [1, 43, 3]
        System.out.println(Arrays.toString(arr4)); // 출력 : [1, 2, 3]  // 원본이 변경되지 않음

        // 3. 다차원 배열
        int[][] arr6 = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };
        System.out.println(arr6[1][1]); // 출력 : 5

        int[] arr7 = {5, 76, 2, 4, 1, 6, 33};
        int[] arr8 = Arrays.copyOf(arr7, arr7.length);

        // 오름차순 정렬(버블 정렬)
        for(int j = 0; j < (arr8.length - 1); j++){
            // 이미 정렬이 끝나면 더이상 for문이 돌지 않게 하기
            boolean completeFlg = true;

            // 제일 마지막은 가장 큰 수가 있으므로 마지막 수는 비교 할 필요가 없음 (for문 범위에서 -j를 빼주면 됨)
            for (int i = 0; i < ((arr8.length - 1) - j); i++) {
                if (arr8[i] > arr8[i + 1]) {
                    int tmp = arr8[i + 1];
                    arr8[i + 1] = arr8[i];
                    arr8[i] = tmp;
                    // if문 안에 들어와서 처리하는지 여부를 체크
                    completeFlg = false;
                }
            }
            // completeFlg가 true 면 처리가 진행 되지 않은 것이므로 for문 종료
            if (completeFlg) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
    }
}
