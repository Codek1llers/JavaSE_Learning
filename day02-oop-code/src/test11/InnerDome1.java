package test11;

public class InnerDome1 {
    static void main() {
        Outer.Inner i = new Outer().new Inner();
        i.show();
        Outer.Inner.show2();
    }
}
class Outer {
    class Inner {
        public void show() {
            System.out.println("show");
        }
        public static void show2() {
            System.out.println("show2");
        }
    }
}
