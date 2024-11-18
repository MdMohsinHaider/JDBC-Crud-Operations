
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserController {

	public static void main(String[] args) {
		
		Connection connection = null;
		try {
			// Step 1. 1 .load/register database driver software
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("step:1 Load/register database driver software");
			
			// Step 2.
			String url = "jdbc:mysql://localhost:3306/mydb-a5";
			String username = "username";
			String password = "sql_user_password";
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Step:2 Create the connection by url,username,password");
			
			// step 3. create Statement
		    Statement statement = connection.createStatement();
		    System.out.println("Step:3 Create statement by Statement(I)--> interfaces");
		    
		    // Step 4. execute Query
		    String insertUserQuery = "insert into user_details(id,name,email,phone,Address) values(113,'Md Mohsin Haider','mdmohsinHaider19@gmail.com','9123456789','abc123gf')";
			int a = statement.executeUpdate(insertUserQuery); 
			if (a>0)System.out.println("Step:4 ExcecuteQuery by execute(String)/executeUpdate(String)/executeQuery(String) methods ✔️✔️");
			else System.err.println("Data Not Succes 😵‍💫");
		    
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		finally {
			try {
				// 5.close the created connection
				connection.close();
				System.out.println("Step:5 Close the created connection");
			} 
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
