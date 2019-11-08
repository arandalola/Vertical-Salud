package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB {
    Connection connect= null;
    Statement stmt = null;
    ResultSet rs = null;

    public DB(){


        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vertical-salud?serverTimezone=UTC"
                    , "root", "");


            // Lectura DB
            stmt = connect.createStatement();

            stmt.executeUpdate("INSERT INTO pedidos(name, first_name, city, product, amount) VALUES (getId, getName, )");
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
                    System.out.println(rs.getString("id") + " " + rs.getString("product_name"));
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

