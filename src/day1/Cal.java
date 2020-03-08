package day1;

/**
 * @Author: Lv
 * @Date: 2020/3/8 19:02
 */


// 连续创建对象 统计有多少个
public class Cal {
    public static void main(String[] args) {
        Child ch1 = new Child(3,"张三");
        ch1.showInfo();
        Child ch2 = new Child(4,"李四");
        ch2.showInfo();
        System.out.println(Child.total);
        System.out.println(ch2.total);
    }
}


class Child{
    int age;
    String name;

    static int total=0; //静态变量，可以被任何一个对象访问
    public Child(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void showInfo(){
        total ++;
        System.out.println("创建一个对象");
    }

}
