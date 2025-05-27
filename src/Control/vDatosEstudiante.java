
package Control;


public class vDatosEstudiante {
    private String Nombre;
    private String Apellidos;
    private int Id;
    private String Correo;
    private String Facultad;

    public vDatosEstudiante() {
    }

    public vDatosEstudiante(String Nombre, String Apellidos, int Id, String Correo, String Facultad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Id = Id;
        this.Correo = Correo;
        this.Facultad = Facultad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    
    
}
