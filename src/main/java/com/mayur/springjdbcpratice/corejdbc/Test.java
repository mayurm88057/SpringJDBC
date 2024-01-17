package com.mayur.springjdbcpratice.corejdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext
				("com/mayur/springjdbcpratice/corejdbc/Config.xml");
		JdbcTemplate jdbc = (JdbcTemplate) context.getBean("JdbcTemplate");
		String sql="insert into employee values(?,?,?)";
		int result = jdbc.update(sql,new Integer(1),"noor","shaikh");
		System.out.println("nummber of records =" + result);
		
	}

}
