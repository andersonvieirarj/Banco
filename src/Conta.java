public abstract class Conta {
    protected String nomeCliente;
    protected int numeroConta;

    public abstract double depositar (double valor);
    public abstract double sacar (double valor);
    public abstract void exibirSaldo();

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
