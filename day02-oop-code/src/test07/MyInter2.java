package test07;

interface MyInter2 {
    void Step1();
    default void Step2() {
        System.out.println("2222Step2");
        Step5();
    }

    void Step3();
    /*在jdk8之前是不允许在接口中定义static修饰的静态方法的
    * 因为接口内的成员方法是默认被abstract修饰的，有冲突*/
    static void Step4() {
        System.out.println("222Step4");
    }
    /*在jdk9之前不允许在接口内定义私有方法的
    * 因为接口内的成员方法默认被public修饰的，有冲突*/
    private void Step5() {
        System.out.println("222Step5");
    }
}