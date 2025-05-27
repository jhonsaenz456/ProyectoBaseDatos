
package Modelo;

import Control.vDatosEstudiante;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class fDatosEstudiante {
     ResultSet rs;
   private ConexionDB con = new ConexionDB();
   private Connection cn = con.conectar();
      public void Mostrar(vDatosEstudiante dts){
   
       try {
         CallableStatement csta = cn.prepareCall("{call usp_InsertarEstudiante(?,?,?,?,?)}");
        csta.setInt(1, dts.getId());
        csta.setString(2, dts.getNombre());
        csta.setString(3, dts.getApellidos());
        csta.setString(4, dts.getCorreo());
        csta.setString(5, dts.getFacultad());

csta.execute();
          
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public DefaultTableModel Listar(){
    DefaultTableModel modelo;
    String []titulos = {"Nombre", "Apellidos", "ID", "Correo Electronico", "Facultad"};
    String [] Datos = new String[5]; 
    modelo = new DefaultTableModel(null, titulos);
    
    try {
        CallableStatement csta = cn.prepareCall("{ call usp_MostrarEstudiantes }");
        rs = csta.executeQuery();

        while(rs.next()){
            Datos[0] = rs.getString("Nombre");
            Datos[1] = rs.getString("apellido");
            Datos[2] = Integer.toString(rs.getInt("ID"));
            Datos[3] = rs.getString("correo_electronico");
            Datos[4] = rs.getString("Facultad");          
            modelo.addRow(Datos);
        }

        return modelo;

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar datos de estudiante: " + e.getMessage());
        return null;
    }
}
  public String obtenerUltimoEstudiante() {
    String resultado = "";
    try {
        CallableStatement csta = cn.prepareCall("{call usp_UltimoEstudiante}");
        ResultSet rs = csta.executeQuery();
        if (rs.next()) {
            resultado += "ID: " + rs.getInt("ID") + "\n";
            resultado += "Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido") + "\n";
            resultado += "Correo: " + rs.getString("correo_electronico") + "\n";
            resultado += "Facultad: " + rs.getString("facultad") + "\n";
        }
    } catch (Exception e) {
        resultado = "Error: " + e.getMessage();
    }
    return resultado;
}

}

