package test13;

import java.util.Random;

public class LambdaTest3 {
    static void main() {
        // 1. 接口实现类，类重写接口抽象方法并实例化对象，对象调用重写后的方法
        // 略
        // 2. 匿名内部类，类实现接口并实例化对象，对象调用方法
        test3(new Interface3() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });
        // 3. Lambda表达式
        test3(() -> new Random().nextInt(100) + 1);
    }
    public static void test3(Interface3 i) {
        int result = i.getNumber();
        System.out.println(result);
    }
}


@FunctionalInterface
interface Interface3 {
    int getNumber();
}
