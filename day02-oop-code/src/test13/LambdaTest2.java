package test13;

public class LambdaTest2 {
    static void main() {
        // 1. 接口实现类，类重写接口抽象方法并实例化对象，对象调用重写后的方法
        // 略
        // 2. 匿名内部类，类实现接口并实例化对象，对象调用方法
        test1(new Interface2() {
            @Override
            public void show(String name) {
                System.out.println("匿名内部类实现的" + name + "的show");
            }
        });
        // 3. Lambda表达式
        test1(name -> System.out.println("Lambda实现的" + name + "的show"));
    }
    public static void test1(Interface2 i) {
        i.show("接口");
    }
}

@FunctionalInterface
interface Interface2 {
    public void show(String name);
}