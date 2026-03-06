public class Test08 {
    public static void main(String[] args) {
        int peakZhu = 8848860;
        double peakZhi = 0.1;
        int count = 0;
        while(peakZhi < peakZhu) {
            peakZhi *= 2;
            count++;
        }
        System.out.println(count);
    }
}
