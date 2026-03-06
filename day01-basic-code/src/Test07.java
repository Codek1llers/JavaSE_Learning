
public class Test07 {
    public static void main(String[] args) {
        int ge = 0;
        int shi = 0;
        int bai = 0;
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) count++;
        }
        System.out.println("水仙花的数量是" + count);


    }
}
