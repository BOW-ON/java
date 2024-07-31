package Edu;

import java.util.function.*;

@FunctionalInterface
interface InterfacePlus {
    int plus(int x, int y);
}
@FunctionalInterface
interface InterfaceMinus {
    int minus(int x, int y);
}

// class Plus implements InterfacePlus {
//     public int plus(int x, int y) {
//         return x + y;
//     }
// }

public class EduLambda {
    public static void main(String[] args) {
        // 1. 일반적 객체지향 이용
        // Plus p = new Plus();
        // System.out.println(p.plus(1, 2));

        // 2. 익명 클래스 이용
        InterfacePlus obj  = new InterfacePlus() {
            public int plus(int x, int y) {
                return x + y;
            }
        };
        System.out.println(obj.plus(1, 2));

        // 3. 람다식
        InterfacePlus lambda = (x, y) -> x + y;
        System.out.println(lambda.plus(1, 2));

        // -----표준 함수형 인터페이스 API
        // 1. 파라미터 1개, 리턴값 있다
        Function<Integer, Integer> funLambda = x -> x + 2;
        System.out.println(funLambda.apply(2));
        // 2. 파라미터 2개, 리턴값 있다
        BiFunction<Integer, Integer, Integer> funBiLambda = (x, y) -> x + y;
        System.out.println(funBiLambda.apply(2, 3));
        // 3. 파라미터 없고, 리턴값이 있다
        Supplier<Integer> funSupplierLambda = () -> 2;
        System.out.println(funSupplierLambda.get());
        // 4. 파라미터 있고, 리턴값도 있는데, 조건식을 표현할 때 사용
        Predicate<Integer> funPredicateLambda = x -> x % 2 == 0; // 연산은 true, false로 나오게 해야됨
        System.out.println(funPredicateLambda.test(2));
        // 5. 파라미터는 있고, 리턴은 없다
        Consumer<String> funConsumerLambda = x -> System.out.println(x);
        funConsumerLambda.accept("안녕 자바");


        // ----function 합성
        // 0. 함수 생성
        // 0-1 커스텀 이용
        InterfacePlus lambda1 = (x, y) -> x + y; // x + y 람다식
        InterfaceMinus lambda2 = (x, y) -> x - y; // x - y 람다식
        System.out.println(lambda1.plus(1, 2));
        System.out.println(lambda2.minus(1, 2));
        // 0-2 제공해주는 API를 이용 (API 이용하는 것이 편하고 속도가 빠름)
        BiFunction<Integer, Integer, Integer> biFncPlusLambda = Integer::sum; ;
        Function<Integer, Integer> biFncMinusLambda = x -> x - 4;

        // 1. andThen
        int result1 = biFncPlusLambda.andThen(biFncMinusLambda).apply(6,4);
        System.out.println(result1);

        // 2. compose
        Function<Integer, Integer> biFncPlusLambda2 = x -> x * 2;
        int result2 = biFncPlusLambda2.compose(biFncMinusLambda).apply(6);
        System.out.println(result2);

        // 3.identity
        Function<Integer, Integer> identityLambda = Function.identity();
        System.out.println(identityLambda.apply(2));

        // ------- Predicate 결함
        Predicate<Integer> greater = x -> x > 0;
        Predicate<Integer> lesser = x -> x < 10;
        // 1. &&
        Predicate<Integer> andPredicate = greater.and(lesser);
        System.out.println(andPredicate.test(100));
        // 2. ||
        Predicate<Integer> orPredicate = greater.or(lesser);
        System.out.println(orPredicate.test(-100));
        // 3. !
        Predicate<Integer> notPredicate = greater.negate();
        System.out.println(notPredicate.test(0));

    }



}
