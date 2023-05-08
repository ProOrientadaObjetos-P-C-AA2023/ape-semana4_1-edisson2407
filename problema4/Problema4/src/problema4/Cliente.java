package problema4;
public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;
    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }
    public String toString(){
        return String.format("Nombres:%s"
                +"\nApellidos:%s"
                +"\nNumero de cedula:%s"
                , getNombres()
                ,getApellidos()
                ,getCedula());
    }
}
