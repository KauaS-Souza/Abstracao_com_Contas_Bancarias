package correcao_conta;

public class ContaPessoaJuridica extends Conta{


    public ContaPessoaJuridica() {
    }

    public ContaPessoaJuridica(int numero, int agncia, double saldo, String titulo) {
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
        setSaldo(getSaldo()-20);
        IO.println("Houve desconto da tarifa");
        exibirSaldo();
    }
}
