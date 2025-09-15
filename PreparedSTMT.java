import java.sql.*;
class PreparedSTMT
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
		
		//Create Query
		String q= "insert into teacher(T_ID,T_Name,T_Add) values (?,?,?)";
		
		//get the PreparedStatement Object
		PreparedStatement pstmt= con.prepareStatement(q);
		
		//set the values to query
		pstmt.setInt(1,10002);
		pstmt.setString(2,"Abdur Rahman");
		pstmt.setString(3,"Dinajpur");
		
		//process the data
		pstmt.executeUpdate();
		
		System.out.println("PreparedSTMT inserted.....");
		con.close();
		
	
		

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}