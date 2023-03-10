public class ContaCorrente extends Conta{
    private double saldoCC;
    public double getSaldoCC() {
        return saldoCC;
    }
    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }
    @Override
    public double depositar(double valor) {
        this.saldoCC = this.saldoCC + valor;
        return this.saldoCC;
    }
    @Override
    public double sacar(double valor) {
        if (this.saldoCC<valor) {
            System.out.println("Você não possui saldo suficiente para esta operação");
        }
        else {
            this.saldoCC = this.saldoCC - valor;
            System.out.println("Saque realizado");
        }
        return 0;
    }
    @Override
    // Agora necessito exibir, neste método, o nome do cliente
    // e o número da conta
    public void exibirSaldo() {
        System.out.println("Nome:" + this.nomeCliente);
        System.out.println("Número Conta: "+this.numeroConta);
        System.out.println("Saldo: "+this.saldoCC);
    }
}
