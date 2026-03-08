package test12;

public class InnerDemo3 {
    public static void main(String[] args) {
        showInner(new InterfaceImpl());
    }

    public static void showInner(Interface i) {
        i.show();
    }

}
interface Interface {
    void show();
}

class InterfaceImpl implements Interface {
    @Override
    public void show() {
        System.out.println("show");
    }
}