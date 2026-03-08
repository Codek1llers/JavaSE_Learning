package test12;

public class InnerDemo4 {
    public static void main(String[] args) {
        test2(new Show(){});
        test1(new Interface2(){
            @Override
            public void show() {
                System.out.println("interface show");
            }
        });
    }
    static void test1(Interface2 i) {
        i.show();
    }
    static void test2(Show w) {
        w.show();
    }

}


class Show {
    public void show() {
        System.out.println("class show");
    }
}

interface Interface2 {
    public void show();
}