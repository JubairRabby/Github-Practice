import java.sql.*;
class firstJDBC
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
		
		if(con.isClosed())
		{
			System.out.println("Connection is Closed");
		}
		else
		{
			System.out.println("Connection is Creating---");
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}