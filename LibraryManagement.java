package com.task1;
import java.sql.*;
import java.util.ArrayList;
import com.task1.*;
public class LibraryManagement {
	ArrayList<Library> l=new ArrayList<Library>();
	public static void main(String[] args)throws Exception {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/madhu","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from college_library");
		while(rs.next())
		{
			Library lm=new Library();
			int bId=rs.getInt(1);
			String bName=rs.getString(2);
			lm.setbId(bId);
			lm.setbName(bName);
			String bAuthor=rs.getString(3);
			lm.setbAuthor(bAuthor);
			String bPublisher=rs.getString(4);
			lm.setbPublisher(bPublisher);
		}
		
	}

}
