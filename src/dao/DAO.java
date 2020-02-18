package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Model;

public class DAO {
	
	public DAO () {
		
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
			
	private void connOracle() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			this.conn = ds.getConnection();
		
			System.out.println("SUCCESS_DB_Connection__"+conn);
		} catch (NamingException e) {
			System.out.println("ERR_DBC_NamingException__"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERR_DBC_SQLException__"+e.getMessage());
		}	
	}	// connOracle()
	
//	public List<Model> select_all() {
//		
//		List<Model> _list = new ArrayList<Model>();
//		
//		return _list;
//	}
	
	public Model select_one (Model m) {
		
		this.connOracle();
		
		String q = "insert into oracle_member (name, userid, pwd, email, phone, admin) values (?, ?, ?, ?, ?, ?,) ";
		try {
			this.pstmt = this.conn.prepareStatement(q);
			this.pstmt.setString(1, m.getName());
		} catch (SQLException e) {
			System.out.println("ERR_select_one");
		}
		
	}
		
}
