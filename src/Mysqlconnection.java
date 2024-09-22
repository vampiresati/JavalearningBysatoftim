import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.sql.SQLException;
public class Mysqlconnection {
    public static void main(String[] args) {
        System.out.println("getting paramter from configuration file");
        Map<String,String> sparamsdict = connection_paramter_as_key_value();
        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(sparamsdict.get("url"), sparamsdict.get("username"), sparamsdict.get("password"));
            viewTcsTable(connection);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }



    public static void viewTcsTable(Connection con) throws SQLException {
        String query = "select * from tcs_status";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String delivery_uuid = rs.getString("delivery_uuid");
                int ticket_number = rs.getInt("ticket_number");
                float 	begin_gal = rs.getFloat("begin_gal");
                int equipment_id = rs.getInt("equipment_id");
                int scan_type = rs.getInt("scan_type");
                System.out.println(ticket_number + ", " + delivery_uuid + ", " + 	begin_gal +
                        ", " + equipment_id + ", " + scan_type);
            }
        } catch (SQLException e) {
            System.out.println("exception");

        }
    }


    public static Map<String,String> connection_paramter_as_key_value(){
        Map<String,String> sparam=new HashMap<>();

        String port="";
        String dbname="";
        String username = ""; // replace with your database username
        String password = ""; //
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
        sparam.put("port",port);
        sparam.put("dbname",dbname);
        sparam.put("password",password);
        sparam.put("username",username);
        sparam.put("url",url);
        return sparam;
    }
    public static String[] connection_paramater(){
        String[] sparam=new String[5];
        String port="";
        String dbname="";
        String username = ""; // replace with your database username
        String password = ""; //
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
        sparam[0]=port;
        sparam[1]=dbname;
        sparam[2]=password;
        sparam[3]=username;
        sparam[4]=url;
        return sparam;
    }
    public class TcsTable {
        private String dbName;
        private Connection con;
        private String dbms;
        public TcsTable(Connection connArg, String dbNameArg, String dbmsArg) {
            super();
            this.con = connArg;
            this.dbName = dbNameArg;
            this.dbms = dbmsArg;
        }
    }


}
