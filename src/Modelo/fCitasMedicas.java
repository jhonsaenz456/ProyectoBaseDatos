
package Modelo;
import Control.vCitasMedicas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class fCitasMedicas {
   ResultSet rs;
   private ConexionDB con = new ConexionDB();
   private Connection cn = con.conectar();
   
   public void Registrar(vCitasMedicas dts){
   
       try {
          CallableStatement csta=cn.prepareCall("{call usp_InsertarCita (?,?,?,?,?,?,?)}");
          csta.setString(1, dts.getMotivoCita());
          csta.setString(2, dts.getEspecialidad());
          csta.setString(3, dts.getMedicoDisponible());
          csta.setString(4, dts.getSede());
          csta.setString(5, dts.getFecha());
          csta.setString(6, dts.getHora());
          csta.setString(7, dts.getDetallesRegistrados());
          rs=csta.executeQuery();
          
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public DefaultTableModel mostrar(){
    DefaultTableModel modelo;
    String []titulos = {"Motivo Cita", "Especialidad", "Medico Disponible", "Sede", "Fecha", "Hora", "Detalles Registrados"};
    String [] registros = new String[7]; 
    modelo = new DefaultTableModel(null, titulos);
    
    try {
        CallableStatement csta = cn.prepareCall("{call usp_ListarCitasMedicas}");
        rs = csta.executeQuery();

        while(rs.next()){
            registros[0] = rs.getString("MotivoCita");
            registros[1] = rs.getString("Especialidad");
            registros[2] = rs.getString("MedicoDisponible");
            registros[3] = rs.getString("Sede");
            registros[4] = rs.getString("Fecha");
            registros[5] = rs.getString("Hora");
            registros[6] = rs.getString("DetallesRegistrados");
            modelo.addRow(registros);
        }

        return modelo;

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar citas: " + e.getMessage());
        return null;
    }
    
}
  public String obtenerUltimaCita() {
    String resultado = "";
    try {
        CallableStatement csta = cn.prepareCall("{call usp_UltimaCita}");
        ResultSet rs = csta.executeQuery();
        if (rs.next()) {
            resultado += "Motivo Cita: " + rs.getString("MotivoCita") + "\n";
            resultado += "Especialidad: " + rs.getString("Especialidad") + "\n";
            resultado += "Medico Disponible: " + rs.getString("MedicoDisponible") + "\n";
            resultado += "Fecha: " + rs.getDate("fecha") + "\n";
            resultado += "Hora: " + rs.getString("hora") + "\n";
             resultado += "Detalles Registrados: " + rs.getString("DetallesRegistrados") + "\n";
        }
    } catch (Exception e) {
        resultado = "Error: " + e.getMessage();
    }
    return resultado;
}

}