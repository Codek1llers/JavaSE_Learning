package test04;

public class AnimalTest04 {
    public static void main(String[] args) {
        useAnimal(new Cat());
        useAnimal(new Dog());
    }

    public static void useAnimal(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog d) {
            d.lookHome();
        }
    }
}



abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    void lookHome() {
        System.out.println("狗看家");
    }

}

