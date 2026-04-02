package correcao_conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, int agncia, double saldo, String titulo) {
        super(numero, agncia, saldo, titulo);
    }

    @Override
    public double deposita(double valor) {
        return super.deposita(valor);
    }

    @Override
    public double sacar(double valor) {
        return super.sacar(valor);
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("Conta poupança não desconta tarifa");
        exibirSaldo();
    }
}
