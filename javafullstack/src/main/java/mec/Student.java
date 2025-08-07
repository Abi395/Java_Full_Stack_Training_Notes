package mec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws SQLException {
		//create();
		//insert();
		//insertrt1();//insert from the user
		insertrt2();//using prepared statement and show the result atlast
		//read();
	}
	public static void create() throws SQLException {
		String url="jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password="abivaasu007";
		String q = "create table record(rono int,name varchar(20),marks int);";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);
	}
	
	public static void insert() throws SQLException {
		String url="jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password="abivaasu007";
		String q = "insert into muthayammal values (1,'Abi',90),(2,'Aishu',100),(3,'Vasanth',105),(4,'Anu',80);";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);
	}
	
	public static void insertrt1() throws SQLException {
		String url="jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password="abivaasu007";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement ss = c.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many students:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the Roll no:");
			int rno = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Name:");
			String name = sc.nextLine();
			System.out.print("Enter the Mark:");
			int mark=sc.nextInt();
			String q = "insert into record values("+rno+",'"+name+"','"+mark+"');";
			ss.executeUpdate(q);
		}
		sc.close();
		
	}
	
	public static void insertrt2() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/mec";
		String un="root";
		String pw="Hari@123";
		String q="insert into record values(?,?);";
		Connection c=DriverManager.getConnection(url, un,pw);
		PreparedStatement ps=c.prepareStatement(q);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=s.nextInt();
			s.nextLine();
			String str=s.nextLine();
			ps.setInt(1, k);
			ps.setString(2, str);
			ps.executeUpdate();
		}
		s.close();
	}

	
	public static void read() throws SQLException {
		String url="jdbc:mysql://localhost:3306/cse";
		String username = "root";
		String password="abivaasu007";
		String q = "select * from muthayammal;";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(q);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}
