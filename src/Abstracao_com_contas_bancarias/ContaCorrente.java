package Abstracao_com_contas_bancarias;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
    }

    public ContaCorrente(double numero, String agencia, String titulo, double saldo) {
        super(numero, agencia, titulo, saldo);
    }


    @Override
    public void deposito(double valor) {
        super.deposito(valor);
       if (valor >= getSaldo()){
           setSaldo(getSaldo()+valor);
           IO.println("Deposito efetuado com sucesso "+ valor);
       } else {
           IO.println("Deposito nãe efetuado"+ valor);
       }

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
