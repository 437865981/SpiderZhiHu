package com.fx.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程共享变量方式（如果每个线程执行的代码不同，如：一个线程使变量自增，一个线程使变量自减）
 * 1、将共享的数据封装再另外一个对象中，然后将这个对象传给每个线程
 */
public class MultiThreadShareData2 {

    /**
     * 共享的数据对象
     */
    static class ShareData{
        private int j ;
        private String name;

        /**
         * 对j进行++的方法
         */
        public synchronized void increment() {
            j++;
            System.out.println("++方法：" + Thread.currentThread().getName()
                    + "操作共享数据后，当前共享数据的值为" + j);
        }

        /**
         * 对j进行--的方法
         */
        public synchronized void decrement() {
            j--;
            System.out.println("--方法" + Thread.currentThread().getName()
                    + "操作共享数据后，当前共享数据的值为" + j);
        }
    }

    /**
     * 对共享的数据对象进行操作的线程类1，j++
     */
     static class MyThread1 implements Runnable{
        private ShareData shareData;

        public MyThread1(ShareData shareData){
            this.shareData=shareData;
        }        @Override
        public void run() {
            shareData.increment();
        }
    }

    /**
     * 对共享的数据对象进行操作的线程类2，j--
     */
    static class MyThread2 implements Runnable{

        private ShareData shareData;

        public MyThread2(ShareData shareData){
            this.shareData=shareData;
        }
        @Override
        public void run() {
            shareData.decrement();
        }
    }

    public static void main(String[] args) {

        ShareData shareData = new ShareData();
        shareData.j = 100;
        shareData.name = "fx";

        MyThread1 myThread1 = new MyThread1(shareData);
        MyThread2 myThread2 = new MyThread2(shareData);

        ExecutorService service = Executors.newCachedThreadPool();
        //2个线程增加
        for (int i = 0; i < 2; i++) {
            service.execute(myThread1);
            service.execute(myThread2);
        }
    }
}
