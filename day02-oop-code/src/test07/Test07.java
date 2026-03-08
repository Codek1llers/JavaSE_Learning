package test07;



public class Test07 {
    public static void main(String[] args) {
        TestInter t = new TestInter();
        t.Step1();
        t.Step2();
        t.Step3();
        MyInter.Step4();
        MyInter2.Step4();
    }
}
class TestInter implements MyInter, MyInter2 {

    @Override
    public void Step1() {
        System.out.println("Step1");
    }

    @Override
    public void Step2() {
        MyInter2.super.Step2();
    }

    @Override
    public void Step3() {
        System.out.println("Step3");
    }


}