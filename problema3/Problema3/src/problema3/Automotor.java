package problema3;
public class Automotor {
    private String cedulaDueno;
    private String marca;
    private int anioFabri;
    private double valor;
    private double valorMatric;
    public Automotor(){}
    public Automotor(String cedulaDueno, String marca, int anioFabri, double valor){
        this.cedulaDueno = cedulaDueno;
        this.marca = marca;
        this.anioFabri = anioFabri;
        this.valor = valor;
    }
    public void setCedulaDueno(String cedulaDueno){
        this.cedulaDueno = cedulaDueno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void calcularValorMatric(){
        this.valorMatric = (valor * 0.002) * (2023 - anioFabri);
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabri() {
        return anioFabri;
    }

    public double getValor() {
        return valor;
    }

    public double getValorMatric() {
        return valorMatric;
    }
    public String toString(){
        return String.format("CARACTERISICAS DE AUTOMOTOR:"
                +"\nCedula del Duenio:%s"
                +"\nMarca del Automotor:%s"
                +"\nAnio de Fabricacion:%d"
                +"\nValor de vehiculo:%.2f"
                +"\nValor de Matricula:%.2f"
                , getCedulaDueno()
                ,getMarca()
                ,getAnioFabri()
                ,getValor()
                ,getValorMatric());
    }
}
