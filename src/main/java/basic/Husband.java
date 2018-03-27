package basic;

/**
 * <h1>封装是利用抽象数据类型将数据和数据的操作封装在一起</h1>
 * <ul>
 *     <li>良好的封装能够减少耦合</li>
 *     <li>类内部的结构可以自由修改</li>
 *     <li>可以对成员进行更精确的控制</li>
 *     <li>隐藏细节，实现细节</li>
 * </ul>
 * <h2>不允许直接访问私有属性，只能通过set,get方法访问</h2>
 * Created by liuBo on 2018/3/27.
 */
public class Husband {

    // 也可以修改数据类型
    private int age;

    public int getAge() {
        return age;
    }

    /**
     * 隐藏内部实现细节，当用户年龄填写大于120，输出错误信息
     * @param age
     */
    public void setAge(int age) {
        if(age>=120){
            System.out.println("ERROR：error age input....");
        }else{
            this.age = age;
        }
    }
}
