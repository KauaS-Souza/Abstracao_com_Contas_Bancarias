package Abstracao_com_contas_bancarias;

public class Banco {
    static void main() {

    ContaCorrente conta = new ContaCorrente();
    conta.setSaldo(2000.00);

        conta.deposito(-20);
        conta.sacar(900.00);


    }

}
