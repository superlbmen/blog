package threaddemo;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多线程及任务执行状态监控
 * Created by liuBo on 2018/4/9.
 */
public class ThreadTest {

    private AtomicInteger ai = new AtomicInteger(0);
    // 所有网站是否采集结束的标志
    private AtomicBoolean running = new AtomicBoolean(true);

    public ThreadTest(){
        for (int i = 0; i < 20; i++) {
            Thread fetch = new ThreadAdd();
            fetch.start();
        }

        // 监控线程
        Thread monitor = new Thread(new Monitor());
        monitor.start();
    }

    protected class ThreadAdd extends Thread{
        @Override
        public void run() {
            while (running.get()){
                ai.addAndGet(1);
            }
        }
    }

    protected class Monitor implements Runnable{
        @Override
        public void run() {
            while (true){
                try { // 每一分钟检查一次网站采集状态
                    Thread.sleep(1000 * 30);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 监控状态满足条件跳出
                running.set(false);
            }
        }
    }

    public static void main(String[] args){
        new ThreadTest();
    }
}
