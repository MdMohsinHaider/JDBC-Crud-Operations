
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUserDetails {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			
			// Step 1:
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("step:1 Load/register database driver software");
			
			
			// Step 2:
			String url = "jdbc:mysql://localhost:3306/mydb-a5";
			String user_name="USERNAME";
			String password ="USERPASSWORD";
			connection = DriverManager.getConnection(url,user_name,password);
			
            
			// Step 3:
			Statement statement = connection.createStatement();
			
			
			// Step 4:
			String update ="delete from user_details where id=113";
			int a = statement.executeUpdate(update);
			if (a>0) {
				System.out.println("Delete succesfuliy... "+a);
			}
			else {
				System.err.println("Delete not Succes.... "+a);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		finally {
			try {
				// Step 5:
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
