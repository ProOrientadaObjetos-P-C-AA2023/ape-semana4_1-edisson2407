
package problema2;

public class Profesores {
    private String nombre;
    private String apellido;
    private double sueldo;
    private double sueldoTotal;
    private String cedula;
    public Profesores(){}
    public Profesores(String nombre, String apellido, double sueldo
            , String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void calcularSueldo(){
        this.sueldoTotal = sueldo + (sueldo * 0.20);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }
    @Override
    public String toString(){
     return String.format("PROFESORES DE INSTITUCION:\n"
             + "Nombre: %s\n"
             + "Apellido: %s\n"
             + "Sueldo Basico: %.2f\n"
             + "Sueldo Total +20%%: %.2f\n"
             + "Numero de cedula: %s\n",
             getNombre(),
             getApellido(),
             getSueldo(),
             getSueldoTotal(),
             getCedula());
}

}
