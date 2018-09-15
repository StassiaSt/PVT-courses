package app_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ReadingDataFtomSQL {
	 public static void main(String[] args) throws ClassNotFoundException
	    {
	        String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	        String user = "root";
	        String password = "root123";


	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection(url, user, password);
	                Statement st = con.createStatement();
	                ResultSet rs = st.executeQuery("select * from Persons"))
	        		
	         {
	            if (rs.next())
	            {
	                System.out.println(rs.getString("PersonID") + " " + rs.getString("LastName") + " " + rs.getString("FirstName"));
	              
	            }

	        }
	        catch (SQLException ex)
	        {
	            ex.printStackTrace();

	        }
	    }

	}



