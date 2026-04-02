package correcao_conta;

public class Banco {

    static void main() {

        ContaCorrente contaCorrente = new ContaCorrente(1996, 23, 1000, "Arthur");

        ContaPoupanca contaPoupanca = new ContaPoupanca(2007, 32, 2000, "Nicolly");

        ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica(3243, 21, 3000, "Heitor");

        IO.println("Conta corrente");
        contaCorrente.deposita(200);
        contaCorrente.sacar(150);
        contaCorrente.exibirSaldo();
        contaCorrente.calcularTarifaMensal();

        IO.println("=======================");
        IO.println("Conta Poupança");
        contaPoupanca.deposita(200);
        contaPoupanca.sacar(150);
        contaPoupanca.exibirSaldo();
        contaPoupanca.calcularTarifaMensal();


        IO.println("====================");
        contaPessoaJuridica.deposita(200);
        contaPessoaJuridica.sacar(150);
        contaPessoaJuridica.exibirSaldo();
        contaPessoaJuridica.calcularTarifaMensal();
    }
}
