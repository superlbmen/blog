package innerclademo;

/**
 * Created by liuBo on 2018/3/27.
 */
public class Child {

    //内部类可以调用外部类私有属性
    private String eat = "eat something";

    private static int age = 10;

    private Child(){
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        child1.eat();
        child2.cookie();
        child3.getAge();
    }

    private class Child1 extends Person{
        @Override
        void eat() {
            System.out.println(eat);
        }
    }

    private class Child2 extends Father{
        @Override
        void cookie() {
            System.out.println("cookie something");
        }
    }

    /**
     * 静态内部类
     */
    private static class Child3{

        private void getAge(){
            System.out.println(age);
        }
    }

    public static void main(String[] args){
        new Child();
    }
}
