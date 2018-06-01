package com.fx.spider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <dl>
 * <dt>ConnUtil</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/18</dd>
 * </dl>
 *
 * @author ${纔訾}
 */
public class ConnUtil {
    private static final String URL="jdbc:mysql://localhost:3306/fx";
    private static final String DRIVERCLASS="com.mysql.jdbc.Driver";
    private static final String USERNAEM="";
    private static final String PASSWORD="";

    public Connection getConn(){
        Connection conn = null;
        try{
            //调用Class.forName()方法加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("成功加载MySQL驱动�?");
        }catch(ClassNotFoundException e1){
           // System.out.println("找不到MySQL驱动!");
            e1.printStackTrace();
        }

        String url="jdbc:mysql://localhost:3306/fx";    //JDBC的URL
        //调用DriverManager对象的getConnection()方法，获得一个Connection对象

        try {
            conn = DriverManager.getConnection(url, "root","root");

        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
