package TestaCliente;

public class cliente1 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(1,1223221211,"Davi",27,"Masculino");
        Cliente cliente02 = new Cliente(2,1292929292,"Alany",25,"Feminino");

        cliente01.visualizar();
        cliente02.visualizar();

    }



}