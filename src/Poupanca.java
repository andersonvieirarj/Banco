public class Poupanca extends Conta{
    private double saldoPP;
    public double getSaldoPP() {
        return saldoPP;
    }
    public void setSaldoPP(double saldoPP) {
        this.saldoPP = saldoPP;
    }
    @Override
    public double depositar(double valor) {
        this.saldoPP = this.saldoPP + valor;
        return this.saldoPP;
    }
    public double depositar (int valor){
        return 0;
    }
    // Sobrecarga: escrever na mesma classe um método com o mesmo nome
    // Para que o Java identifique corretamente a sobrecarga,
    // a assinatura do método precisa ser diferente
    public double depositar (){
        return 0;
    }
    public double depositar (double valor1, double valor2){
        return 0;
    }

    @Override
    public double sacar(double valor) {
        if (this.saldoPP<valor) {
            System.out.println("Você não possui saldo suficiente para esta operação");
        }
        else {
            this.saldoPP = this.saldoPP - valor;
            System.out.println("Saque realizado");
        }
        return 0;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo: " + this.saldoPP);
    }
}
