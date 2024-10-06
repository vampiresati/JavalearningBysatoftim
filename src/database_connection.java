import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.io.*;

public class database_connection {
    public static void main(String[] args) {
        String port="";
        String dbname="";
        String username = ""; // replace with your database username
        String password = ""; // replace with your database password

        try{
            FileReader reader = new FileReader("/home/satvir/db.properties");
            Properties p = new Properties();
            p.load(reader);
            port=p.getProperty("port");
            dbname=p.getProperty("dbname");
            password=p.getProperty("password");
            username=p.getProperty("username");
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }

        String url = "jdbc:mysql://localhost:"+port+"/"+dbname; // replace with your database details


        try {
            // Load the JDBC driver (optional for newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tcs_status");


            ResultSetMetaData rsmd = resultSet.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for(int i=1;i<=numberOfColumns;i++){
                System.out.println(rsmd.getColumnName(i)+','+rsmd.getColumnClassName(i));
          
            }
            // Process the result set
            while (resultSet.next()) {
                System.out.println("deviceId: " + resultSet.getString("deviceId")+"ticket _number"+resultSet.getLong("ticket_number"));
            }

            //update query method
            PreparedStatement pstmt;
            pstmt = connection.prepareStatement("UPDATE tcs_status " + "SET DriverId = ? " + "WHERE deviceId = ? and  uni =?");
            pstmt.setString(1, "786");
            pstmt.setString(2, "00000000a68c3517");
            pstmt.setInt(3, 109207);
            System.out.println(pstmt);
            pstmt.executeUpdate();




            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
