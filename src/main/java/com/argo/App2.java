package com.argo;

import com.argo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args){
        //获取IoC设置
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDao bookDao = (BookDao) context.getBean("bookDao");
    }
}
