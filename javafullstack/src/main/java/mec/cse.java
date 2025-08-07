package mec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cse {
	public static void main(String[] args) throws SQLException {
		//create();
		insert();
		read();
	}
	public static void create() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password = "abivaasu007";
		//to create a table
		//String q = "create table class(rno int, name varchar(10));";
		//to insert the values
		String q = "insert into class values(1,'Abi'),(2,'Aishu);";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);

	}
	
	//for inserting to create a method called insert or else we give in create itself
	public static void insert() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password = "abivaasu007";
		String q = "insert into class values(3,'Vaasu'),(4,'Anu');";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);
	}
	
	public static void read() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password = "abivaasu007";
		String q = "select * from class;";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(q);//to show the output in java
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}

}