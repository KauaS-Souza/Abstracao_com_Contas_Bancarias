package correcao_conta;

public abstract class Conta {

    private int numero;
    private int agncia;
    private double saldo;
    private String titulo;

    public Conta(){

    }

    public Conta(int numero, int agncia, double saldo, String titulo) {
        this.numero = numero;
        this.agncia = agncia;
        this.saldo = saldo;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgncia() {
        return agncia;
    }

    public void setAgncia(int agncia) {
        this.agncia = agncia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double deposita(double valor){
        return saldo = saldo + valor;
    }

    public double sacar(double valor){

        if (valor > saldo){
            IO.println("seu saldo é insuficiente " + saldo);
            return saldo;
        } else {
            return saldo = saldo - valor;
        }

    }

    public void exibirSaldo(){
        IO.println("Seu saldo é: " + saldo);
    }

    public abstract void calcularTarifaMensal();
}
