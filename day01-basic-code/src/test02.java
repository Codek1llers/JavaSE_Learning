public class test02 {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 2147483647;
        int c = a + b;
        System.out.println(c);
        byte a2 = 90;
        byte b2 = 90;
//        byte c2 = a2 + b2;报错
        byte c2 = (byte)(a2 + b2);
        System.out.println(c2);
    }
}
