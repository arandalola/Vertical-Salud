import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB {
    public static void main (String[] args) throws SQLException{
        Connection connect= null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://localhost/vertical_salud?serverTimezone=UTC"
                    , "root", "");

            // Lectura DB
            stmt = connect.createStatement();
            rs = stmt.executeQuery("SELECT * FROM pedidos");
            if(stmt.execute("SELECT * FROM pedidos")){
                rs = stmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("first_name"));
                    System.out.println(rs.getString("city"));
                    System.out.println(rs.getString("product"));
                    System.out.println(rs.getInt("amount"));
                }
            }
            rs = stmt.executeQuery("SELECT * FROM productos");
            if(stmt.execute("SELECT * FROM productos")){
                rs = stmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("product_name"));
                }
            }
            rs = stmt.executeQuery("SELECT * FROM user");
            if(stmt.execute("SELECT * FROM user")){
                rs = stmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("first_name"));
                    System.out.println(rs.getString("city"));
                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

