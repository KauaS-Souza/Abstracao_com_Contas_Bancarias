package Abstracao_com_contas_bancarias;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
    }

    public ContaCorrente(double numero, String agencia, String titulo, double saldo) {
        super(numero, agencia, titulo, saldo);
    }


    @Override
    public Object deposito(double valor) {
        super.deposito(valor);
       double total= getSaldo() + valor;
       if (total <= valor){
           IO.println("Deposito efetuado com sucesso "+ getSaldo() + total);
       } else {
           IO.println("Deposito nãe efetuado"+ total);
       }
        return null;
    }

    @Override
    public void sacar(double saque) {
        if (getSaldo() >= saque){
            IO.println("Saque bem sucedido");
            setSaldo(getSaldo()-saque);
            IO.println("Seu saldo atual é: "+ getSaldo());
        } else {
            IO.println("Saque insuficiente: "+ getSaldo());
        }
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
    }

    @Override
    public void calcularTarifaMensal() {
        // tarifa R$12,00;
    }
}
