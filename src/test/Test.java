package test;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Test {
	
	public Test() throws Exception {
		
		Context initContext = new InitialContext();
		Context envContext  = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		
		System.out.println("SUCCESS_DB_CONNECTION");
		
	}

}
