package Edu.ClassExtends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
        // Whale whale = new Whale();
        // System.out.println(whale.birth());

        // FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        // System.out.println(flyingSquirrel.residence());

        // *다형성
        // Mammal whale = new Whale(); // 상속 받는 부모의 타입(Mammal)을 지정하여 자식(Whale)을 인스턴스 할 수 있음
        // 1. 자식한테만 있는 메소드는 사용되어 실행됨
        // System.out.println(whale.Swimming());

        // 2. 자식이 부모에서 오버라이딩 받은 메소드를 사용하고 있을 경우 > 자식에 있는 메소드가 실행됨
        // 자식한테 있는 메소드를 사용 불가하지만 오버라이딩한 경우에는 자식 메소드가 실행됨
        // whale.test();

        // then) 다형성을 왜 사용하는가 ?
        //  Whale[] arr = new Whale[2]; 인경우에는 arr[1] = new FlyingSquirrel(); 사용하지 못함
        //  arr 안에 두개의 인스턴스를 넣을경우 타입을 부모 타입으로 지정하면 가능하므로 다형성 사용.
        // Mammal[] arr = new Mammal[2];
        // arr[0] = new Whale();
        // arr[1] = new FlyingSquirrel();

        // *업캐스팅 : 자식 클래스가 부모 클래스 타입으로 캐스팅 되는 것
        Mammal mammal;
        Whale whale = new Whale();
        mammal = (Mammal)whale; // 타입 변환(업캐스팅)
        System.out.println(mammal.birth());

        // *다운캐스팅 : 업캐스팅한 부모 클래스가 자식클래스 타입으로 캐스팅 되는 것
         Mammal[] arr = new Mammal[2];
         arr[0] = new Whale();
         arr[1] = new FlyingSquirrel();

        Whale whale2 = (Whale)arr[0]; // 타입 변환(다운캐스팅)
        System.out.println(whale2.swimming());

        // *타입의 다형성
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(whale);
        mammals.add(flyingSquirrel);

        // *파라미터의 다형성
        PrintTest printTest = new PrintTest();
        printTest.instancePrint(whale);
        printTest.instancePrint(flyingSquirrel);

    }
}

interface Swim {
    public String swimming();
}

class PrintTest {
    final public void instancePrint(Mammal mammal) {
        System.out.println(mammal.toString());
    }
}

// 부모 클래스 - Mammal
abstract class Mammal {
    protected String name;

    // 생성자
    public Mammal(String name) {
        this.name = name;
    }

    final public String birth() {
        return this.name + " 출산 합니다.";
    }

    // 추상 클래스
    // 추상화 작업을 진행하는 도중 메소드 안의 내용이 조금씩 다를 경우 abstract로 추상화 한다.
    // abstract로 지정한 메소드는 자식 클래스에서 무조건 사용은 해야되고 다시 재정의해서 사용한다.
    abstract public String residence();

    public void test() {
        System.out.println("부모 테스트");
    }
}


// 자식 클래스 - Whale
// 인터페이스 구현 - Swim
class Whale extends Mammal implements Swim {
    // protected String name; // 추상화 작업으로 삭제(부모 클래스 - Mammal)

    // 생성자
    public Whale() {
        // this.name = "고래"; // 추상화 작업으로 삭제(부모 클래스 - Mammal)
        super("고래");
    }

    public String residence() {
        return this.name + "바다에 삽니다.";
    }
    // 추상화 작업으로 삭제(부모 클래스 - Mammal)
    // public String birth() {
    //     return this.name + " 출산 합니다.";
    // }

    // 인터페이스 구현
    public String swimming() {
        return this.name + " 헤엄 칩니다.";
    }

    public void test() {
        System.out.println("자식 테스트");
    }
}

// 자식 클래스 - FlyingSquirrel
class FlyingSquirrel extends Mammal {
    // protected String name; // 추상화 작업으로 삭제(부모 클래스 - Mammal)

    // 생성자
    public FlyingSquirrel() {
        // this.name = "날다람쥐"; // 추상화 작업으로 삭제(부모 클래스 - Mammal)
        super("날다람쥐");
    }

    public String residence() {
        return this.name + " 산에 삽니다.";
    }
    // 추상화 작업으로 삭제(부모 클래스 - Mammal)
    // public String birth() {
    //     return this.name + " 출산 합니다.";
    // }
}

// 인터페이스 구현
class FlyingFish implements Swim {
    protected String name;

    public FlyingFish() {
        this.name = "날치";
    }

    public String swimming() {
        return this.name + " 헤엄 칩니다.";
    }
}