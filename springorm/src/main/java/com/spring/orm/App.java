package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

import com.spring.orm.*;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
         Student student= new Student(254,"Kumar Mijar","Panchkhal");
         		
         int r = studentDao.insert(student);
         System.out.println("done "+r);
    }
}
