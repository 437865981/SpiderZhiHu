package com.fx.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程共享变量的方式（每个线程执行相同的代码块，如多个线程买票）
 * 1、如果每个线程执行的代码相同，可以使用同一个Runnable对象，这个Runnable对象中有那个共享数据。例如：卖票系统。
 */
public class MultiThreadShareData {

    /**
     * 同一个Runnable对象
     */
   static class RunnableShareData implements Runnable{
        private int count = 100;

        @Override
        public void run() {
            int a=  123;
            while (count>0){
                if (count ==50){
                    System.out.println(Thread.currentThread().getName()+":已经50张啦");
                    System.out.println(Thread.currentThread().getName()+"a:"+a);
                    a ++ ;
                    count = 100;


                }else {
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 买票后剩余：" + count + "张");
                }
            }
        }
    }

    public static void main(String[] args) {
        RunnableShareData runnableShareData = new RunnableShareData();

        ExecutorService service = Executors.newCachedThreadPool();
        //四个现场共享Runnable接口
        for (int i = 0; i < 4; i++) {
            service.execute(runnableShareData);
        }
    }
}
