package problema4;
public class Problema4 {
    public static void main(String[] args) {
        Cheques cheque1 = new Cheques(999.99);
        Cliente cliente1 = new Cliente("Edisson F.", "Chamba A.", "1950001733");
        Banco banco1 = new Banco("Banco de Loja", 3);
        cheque1.setCliente(cliente1);
        cheque1.setBanco(banco1);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
    
}
