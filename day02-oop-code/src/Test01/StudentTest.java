package Test01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
        s1.setName("张三");
        System.out.println(s1.getName());
    }
}
