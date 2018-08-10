package jdbcconnective;

import java.sql.*;

public class ConnectionMariaDB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// addressbook?autoReconnect=true&useSSL=false";
				// user=root&password=false&

				String url = "jdbc:mariadb://127.0.0.1/addressbook?autoReconnect=true&useSSL=false";
				String uname = "root";
				String pass = "";

				String query = "SELECT `address` FROM `addressbook` WHERE `id`=3 ";

				Class.forName("org.mariadb.jdbc.Driver"); // lecture Class for name "telusko"

				Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);

				rs.next();
				String name = rs.getString("address");

				System.out.println(name);

				st.close();
				con.close();

		

	}

}
