package test13;

public class LambdaTest4 {    static void main() {
    // 1. 接口实现类，类重写接口抽象方法并实例化对象，对象调用重写后的方法
    // 略
    // 2. 匿名内部类，类实现接口并实例化对象，对象调用方法
        test4(new Interface4(){
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
    // 3. Lambda表达式
        test4((a, b) ->  a - b);
}
    public static void test4(Interface4 i) {
        int result = i.calc(10, 20);
        System.out.println(result);
    }
}


@FunctionalInterface
interface Interface4 {
    int calc(int a, int b);
}
