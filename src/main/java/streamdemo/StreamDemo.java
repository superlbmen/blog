package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 查询集合中年龄小于等于20的人名并排序
 * Created by liuBo on 2018/3/27.
 */
public class StreamDemo {

    /**
     * java7之前，只能从数据库取出数据遍历
     * 然后存储到新的数据结构
     * @param users
     * @return
     */
    public List<String> beforeJava7(List<User> users){
        // 取年龄 <= 20的用户
        List<User> tmpList = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() <= 20){
                tmpList.add(user);
            }
        }
        // 排序
        Collections.sort(tmpList, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });
        // 取名字
        List<String> userNames = new ArrayList<>();
        for(User user : tmpList){
            userNames.add(user.getName());
        }
        return userNames;
    }

    /**
     * 直接操作数据结构
     * @param users
     * @return
     */
    private List<String> nowJava8(List<User> users){
        //为了利用多核架构并行执行这段代码，只需要把stream()换成parallelStream()：
        List<String> userNames = users.stream()
                .filter(user -> user.getAge()<=20)
                .sorted(Comparator.comparing(User::getName))
                .map(User::getName)
                .collect(Collectors.toList());

        return userNames;
    }
}
