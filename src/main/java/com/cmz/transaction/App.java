package com.cmz.transaction;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceUtils;

import com.cmz.transaction.service.DefaultFooService;
import com.cmz.transaction.service.FooService;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new FileSystemXmlApplicationContext("conf/spring.xml");
    	
    	Connection conn = DataSourceUtils.getConnection((DataSource) context.getBean("dataSource"));
    	try {
			System.out.println(conn.isClosed()+"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	FooService fooService = (FooService) context.getBean("fooService");
    	fooService.insertFoo(null);
    }
}
