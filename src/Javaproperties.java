import java.util.Properties;
import java.io.*;
public class Javaproperties {
    public static void main(String[] args) {
        try{
        FileReader reader = new FileReader("/home/satvir/db.properties");
        Properties p = new Properties();
        p.load(reader);
        // access properties data
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("dbname"));
        System.out.println(p.getProperty("port"));
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}
