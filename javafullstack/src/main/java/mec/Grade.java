package mec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) throws SQLException {
		//create();
		//insert();
		top3userRead();
	}
		public static void create() throws SQLException {
			String url="jdbc:mysql://localhost:3306/cse";
			String username = "root";
			String password="abivaasu007";
			String q = "create table report(rono int,name varchar(20),marks int);";
			Connection c = DriverManager.getConnection(url, username, password);
			Statement s = c.createStatement();
			s.executeUpdate(q);
		}
		public static void insert() throws SQLException {
			String url="jdbc:mysql://localhost:3306/cse";
			String username = "root";
			String password="abivaasu007";
			String q = "insert into report values (?,?,?);";
			Connection c = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = c.prepareStatement(q);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many students:");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print("Enter the Roll no: ");
				int rno=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the name: ");
				String name = sc.nextLine();
				System.out.print("Enter the marks: ");
				int marks = sc.nextInt();
				ps.setInt(1,rno);
				ps.setString(2, name);
				ps.setInt(3, marks);
				ps.executeUpdate();
			}
			sc.close();
		}
		
		public static void top3userRead() throws SQLException {
			String url="jdbc:mysql://localhost:3306/cse";
			String username = "root";
			String password="abivaasu007";
			String q = "SELECT name,marks FROM report ORDER BY DESC LIMIT 3;";
			Connection c= DriverManager.getConnection(url, username, password);
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(q);
			while(rs.next()) {
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				if(marks>=90 && marks<=100) {
					System.out.println("Grade A");
				}
				else if(marks>=80 && marks<=90) {
					System.out.println("Grade B");
				}
				else if(marks>=70 && marks<=80) {
					System.out.println("Grade C");
				}
				else {
					System.out.println("Fail");
				}
				
			}
		}

}
