package test11;

public class InnerDemo2 {
    static void main() {
        Outer2.Inner i = new Outer2.Inner();
        i.show();
        Outer2.Inner.show2();
    }
}

class Outer2 {
    static class Inner {
        public void show() {
            System.out.println("show()");
        }
        public static void show2() {
            System.out.println("show2()");
        }
    }
}
