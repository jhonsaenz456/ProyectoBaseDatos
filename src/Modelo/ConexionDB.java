
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Semana88;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "usuarioSQL";
    private static final String CONTRASENA = "321";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return conexion;
    }
}

            

