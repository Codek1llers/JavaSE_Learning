package test10;

import java.util.Objects;

public class Test10 {
    static void main() {
        Student s1 = new Student(18, "张三");
        Student s2 = new Student(18, "张三");
        if(s1.equals(s2)) System.out.println("s1和s2相等");
        else System.out.println("s1和s2不相等");
        System.out.println(Objects.equals(s1, s2));
    }
}
