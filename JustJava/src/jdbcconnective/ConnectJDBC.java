package jdbcconnective;

import java.sql.*;

public class ConnectJDBC {

	// Java JDBC Connectivity
	/*
	 * 1. Import library --> java.sql 
	 * 2. Load and register the driver --> com.mysql.jdbc.Driver (from maven repo) 
	 * 3. Create connection --> Connection Interface 
	 * 4. Create statement --> Statement Interface 
	 * 5. Execute the query 
	 * 6. Process the result 
	 * 7. Close connection
	 * 
	 */

	public static void main(String[] args) throws Exception {

		// addressbook?autoReconnect=true&useSSL=false";
		// user=root&password=false&

		String url = "jdbc:mysql://localhost:3308/addressbook";
		String uname = "root";
		String pass = "";

		String query = "SELECT firstname,lastname FROM `addressbook` WHERE id=12 ";

		Class.forName("com.mysql.jdbc.Driver"); // lecture Class for name "telusko"

		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		rs.next();
		String fname = rs.getString("firstname");
		String lname = rs.getString("lastname");

		System.out.println(fname +" "+lname);

		st.close();
		con.close();

	}

}
