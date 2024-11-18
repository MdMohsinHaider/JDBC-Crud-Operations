
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataShow {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			// Step 1:
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("step:1 Load/register database driver software");
			
            // Step 2:
			String url = "jdbc:mysql://localhost:3306/mydb-a5";
			String user_name="UserName";
			String password ="UserPasswaord";
			connection = DriverManager.getConnection(url,user_name,password);
			
            // Step 3:
			Statement statement = connection.createStatement();
			
            // Step 4:
			String display ="select * from user_details";
			ResultSet set = statement.executeQuery(display);
			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				String email = set.getString("email");
				long phone = set.getLong("phone");
				String address = set.getString("Address");
				
				System.out.println("id : "+id +"    name: "+name+"    Email: "+email+"    Phone : "+ phone+"    address : "+address);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			// Step 5:
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
