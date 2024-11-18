
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplaySingleUser {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			// Step 1:
						Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println("step:1 Load/register database driver software");
						
		
			// Step 2:
						String url = "jdbc:mysql://localhost:3306/mydb-a5";
						String user_name="UserName";
						String password ="UserPassword";
						connection = DriverManager.getConnection(url,user_name,password);
			
						
			// Step 3:
						Statement statement = connection.createStatement();
						
						
			// Step 4:
						String display_single_data ="select * from user_details where id=110";
						ResultSet set = statement.executeQuery(display_single_data);
						
						boolean b = set.next();
						
						if (b) {
							int id = set.getInt("id");
							String name = set.getString("name");
							String email = set.getString("email");
							long phone = set.getLong("phone");
							String address = set.getString("Address");
								
							System.out.println("\n  id : "+id +"\n  name: "+name+"\n  Email: "+email+"\n  Phone : "+ phone+"\n  address : "+address);
						}
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				//step 5
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
