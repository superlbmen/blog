package interfacedemo;

import java.util.LinkedHashMap;

/**
 * 继承父类抽象方法，实现动作和家庭抽象方法
 * Created by liuBo on 2018/3/27.
 */
public class Cat extends Anamal implements Action,Home {

    public Cat(){
        // 子类调用父类方法
        super.face();
        fly();
        eat();
        home();
    }

    @Override
    public void fly() {
        System.out.println("fly -- no --");
    }

    @Override
    void eat() {
        System.out.println("eat -- yu --");
    }

    @Override
    public void home() {
        System.out.println("have home ze m l");
    }

    public static void main(String[] args){
//        new Cat();
//        //直接调用抽象方法的属性
//        System.out.println("------ "+Action.action);

        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
        lmap.put("语文", 1);
        lmap.put("数学", 2);
        lmap.put("英语", 3);
        lmap.put("历史", 4);
        lmap.put("政治", 5);
        lmap.put("地理", 6);
        lmap.put("生物", 7);
        lmap.put("化学", 8);
        lmap.forEach((k,v) -> System.out.println("k---"+k+"------v----"+v));
    }

}
