package Edu;

import java.util.ArrayList;
import java.util.List;

public class EduGenerics {
    public static void main(String[] args) {
        // 1. 타입파라미터가 1개일때
        Box<String> box = new Box<String>();
        Box<Integer> box2 = new Box<Integer>();
        box.add("떡볶이");
        box.add("텐동");
        box.add("써브웨이");
        System.out.println(box.toString());

        // 2. 여러개일 때
        Box2<String, Integer> box3 = new Box2<String, Integer>();
        box3.add("떡볶이", 4000);
        box3.add("텐동", 3000);
        box3.add("써브웨이", 5000);
        System.out.println(box3.toString());
    }
}

// String 이나 Interger 로 타입을 지정해주면 그 타입만 사용할 수 있으므로
// 필요할때마다 만들어야되서 불편함
// class Box {
//     List<String> items = new ArrayList<String>();
// }
//
// class Box2 {
//     List<Integer> items = new ArrayList<Integer>();
// }

// So) 외부에서 공통으로 타입을 지정하여 Generics로 만들고
// main에서 타입을 지정해주면서 사용하면 된다.
// 1. 타입파라미터가 1개일때
class Box<T> {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
// 2. 여러개일 때
class Box2<T, E> {
    List<T> items1 = new ArrayList<>();
    List<E> items2 = new ArrayList<>();

    public void add(T item1, E item2) {
        this.items1.add(item1);
        this.items2.add(item2);
    }

    @Override
    public String toString() {
        return items1.toString() + " :" + items2.toString();
    }
}
