package Abstracao_com_contas_bancarias;

public abstract class Conta {

    private double numero;
    private String agencia;
    private String titulo;
    private double saldo;

    public Conta(){

    }

    public Conta(double numero, String agencia, String titulo, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titulo = titulo;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){

    }

    public void sacar(double valor){

    }

    public abstract void calcularTarifaMensal();

    public void exibirSaldo(){

    }
}
