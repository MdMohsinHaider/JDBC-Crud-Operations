
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUserDetails {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			// Step 1:
						Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println("step:1 Load/register database driver software");
			// Step 2:
						String url = "jdbc:mysql://localhost:3306/mydb-a5";
						String user_name="UserName";
						String password ="UserPssword";
						connection = DriverManager.getConnection(url,user_name,password);
			// Step 3:
						Statement statement = connection.createStatement();
			// Step 4:
						String update ="update user_details set phone ='9999999999' where id=100";
						int a = statement.executeUpdate(update);
						if (a>0) {
							System.out.println("Update succesfuliy... "+a);
						}
						else {
							System.err.println("Update not Succes.... "+a);
						}
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
