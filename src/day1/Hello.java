package day1;

/**
 * @Author: Lv
 * @Date: 2020/3/8 19:02
 */

// 构造函数包含初始化类对象

public class Hello {
    public static void main(String[] args) {
        Dog dog1 = new Dog(2,"小黄");
        dog1.showInfo();
        Person p1 = new Person(dog1,23,"张三");
        Person p2 = new Person(dog1,33,"李四");

        p1.showInfo();
        p2.showInfo();

    }
}

class  Person{
    int age;
    String name;
    Dog dog;
    public Person(Dog dog,int age,String name){
        this.age = age;
        this.name = name;
        this.dog = dog;
    }
    public void showInfo(){
        System.out.println("人名叫："+this.name);
        System.out.println("狗名叫："+this.dog);
    }
}

class Dog{
    int age;
    String name;
    public Dog(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void showInfo(){
        System.out.println("狗名叫："+this.name);
    }

}
