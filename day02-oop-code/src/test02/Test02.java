package test02;

public class Test02 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(18);
        t.setName("张三");
        System.out.println(t.getAge());
        System.out.println(t.getName());

        Student s = new Student();
        s.setAge(11);
        s.setName("李四");
        s.setScore(90.5);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getScore());

        Teacher t1 = new Teacher("张五", 19);
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        Student s1 = new Student("王六", 12, 90.5);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getScore());
    }
}
