public class Principal {
    public static void main(String[] args) {

    ContaCorrente c = new ContaCorrente();
    Poupanca p = new Poupanca();

    p.depositar();
    p.depositar(1000);
    p.depositar(1001, 1002);

    }
}