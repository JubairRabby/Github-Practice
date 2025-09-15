import java.sql.*;
class InsertJDBC
{
	public static void main(String args[])
	{
		try
		{
		//load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creating a Connection
		String url="jdbc:mysql://localhost:3306/jubair";
		String username="root";
		String password="rabby5605@";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		//create a quary
		String q = "create table tree (T_ID int(20) primary key auto_increment, T_Name varchar(200) not null, T_Add varchar (300))";
		
		//Create a Statement
		Statement stmt= con.createStatement();
		stmt.executeUpdate(q);
		
		System.out.println("Table Created in Database");
		con.close();
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}