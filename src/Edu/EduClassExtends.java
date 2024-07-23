package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

// 부모 클래스
class Mammal {
    String kinds;
    protected String name;

    public Mammal() {
        this.kinds = "포유류";
    }

    public void printInfo() {
        System.out.println("Kinds: " + this.kinds);
    }
}

// 자식 클래스
class Whale extends Mammal {
    public Whale() {
        super(); // super()가 제일 첫줄에 있어야됨
        this.name = "고래";
        // System.out.println("Whale");
        System.out.println(this.kinds.concat(this.name));
    }

    @Override // 오버라이딩 했는 메소드라고 명시해둠
    // 메소드 명, 파라미터, 리턴 타입 3개가 일치해야 오버라이딩이 됨
    public void printInfo() {
        super.printInfo(); // 부모의 printInfo 메소드도 사용
        System.out.println("Name: " + this.name);
    }
}
