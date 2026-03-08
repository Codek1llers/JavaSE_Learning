package test13;

public class LambdaTest1 {
    static void main() {
        // 1. 接口实现类，类重写接口抽象方法并实例化对象，对象调用重写后的方法
        // 略
        // 2. 匿名内部类，类实现接口并实例化对象，对象调用方法
        test1(new Interface() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show");
            }
        });
        // 3. Lambda表达式
        test1(() -> System.out.println("Lambda实现的show")
        );
    }
    public static void test1(Interface i) {
        i.show();
    }
}


@FunctionalInterface
interface Interface {
    public void show();
}
