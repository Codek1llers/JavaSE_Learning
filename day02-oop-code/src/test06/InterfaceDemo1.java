package test06;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.show1();
    }
}

interface Inter {
    void show();
    void show1();
}

class Demo implements Inter {

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void show1() {
        System.out.println("show1");
    }
}
