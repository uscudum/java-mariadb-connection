import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3300/pruebadb";
        String user = "root";
        String password = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}