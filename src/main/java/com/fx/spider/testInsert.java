package com.fx.spider;

/**
 * <dl>
 * <dt>testInsert</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/18</dd>
 * </dl>
 *
 * @author ${纔訾}
 */
public class testInsert {
    public static void main(String[] args) {
        ZhiHuThread runable = new ZhiHuThread();
         new Thread(runable,"https://www.zhihu.com/people/xiao-yao-sheng-45/following").start();
         new Thread(runable,"https://www.zhihu.com/people/meng-de-jie-xi-31/following").start();


    }
}
