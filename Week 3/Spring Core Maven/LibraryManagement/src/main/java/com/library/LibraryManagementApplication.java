package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService svc = ctx.getBean("bookService", BookService.class);
        System.out.println(svc.findBookTitleById(5));
//        svc.displayBookInfo();
        svc.printBookInfo();
    }
}
