package queuedemo;

import java.util.PriorityQueue;

/**
 * Created by liuBo on 2018/4/9.
 */
public class PriorityQueueTest {

    public static void main(String[] args){
        PriorityQueue<PrQueueTest> priorityQueue = new PriorityQueue<>();
        PrQueueTest queueTest = new PrQueueTest();
        queueTest.setName("a");
        queueTest.setNumber(1);
        priorityQueue.add(queueTest);
        PrQueueTest queueTest2 = new PrQueueTest();
        queueTest2.setName("b");
        queueTest2.setNumber(3);
        priorityQueue.add(queueTest2);
        PrQueueTest queueTest3 = new PrQueueTest();
        queueTest3.setName("c");
        queueTest3.setNumber(2);
        priorityQueue.add(queueTest3);
        // 排序前
        priorityQueue.forEach(n-> System.out.println("before - "+n.name));
        // 排序后
        while (priorityQueue.size() > 0){
            System.out.println("after - "+priorityQueue.poll().name);
        }
    }

    private static class PrQueueTest implements Comparable<PrQueueTest>{
        private String name;
        private int number;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public int compareTo(PrQueueTest o) {
            return number - o.number;
        }
    }

}
