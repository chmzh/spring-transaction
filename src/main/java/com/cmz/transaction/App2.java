package com.cmz.transaction;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.cmz.transaction.service.DefaultFooService;
import com.cmz.transaction.service.FooService;






public class App2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new FileSystemXmlApplicationContext("conf/spring.xml");
    	DataSourceTransactionManager txManager = (DataSourceTransactionManager) context.getBean("txManager");
    	DefaultTransactionDefinition def = new DefaultTransactionDefinition();
    	// explicitly setting the transaction name is something that can only be done programmatically 
    	def.setName("SomeTxName"); 
    	def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    	TransactionStatus status = txManager.getTransaction(def); 
    	try {
    	    // execute your business logic here
    	}catch(RuntimeException e){
    		
    	}
    	
    	txManager.commit(status);
    }
}
