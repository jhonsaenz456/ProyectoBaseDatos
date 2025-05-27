
package Control;


public class vCitasMedicas {
     private String MotivoCita;
     private String Especialidad; 
     private String MedicoDisponible;
     private String Sede;
     private String Fecha; 
     private String Hora;
     private String DetallesRegistrados;

    public vCitasMedicas() {
    }

    public vCitasMedicas(String MotivoCita, String Especialidad, String MedicoDisponible, String Sede, String Fecha, String Hora, String DetallesRegistrados) {
        this.MotivoCita = MotivoCita;
        this.Especialidad = Especialidad;
        this.MedicoDisponible = MedicoDisponible;
        this.Sede = Sede;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.DetallesRegistrados = DetallesRegistrados;
    }

    public String getMotivoCita() {
        return MotivoCita;
    }

    public void setMotivoCita(String MotivoCita) {
        this.MotivoCita = MotivoCita;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getMedicoDisponible() {
        return MedicoDisponible;
    }

    public void setMedicoDisponible(String MedicoDisponible) {
        this.MedicoDisponible = MedicoDisponible;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDetallesRegistrados() {
        return DetallesRegistrados;
    }

    public void setDetallesRegistrados(String DetallesRegistrados) {
        this.DetallesRegistrados = DetallesRegistrados;
    }
    
     
}
