package futebolInterface;

import java.util.Date;

public class Clube {

    private String nome;
    private Date funadacao;
    private double valor;

    public Clube(){

    }

    public Clube(String nome, Date funadacao, double valor) {
        this.nome = nome;
        this.funadacao = funadacao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getFunadacao() {
        return funadacao;
    }

    public void setFunadacao(Date funadacao) {
        this.funadacao = funadacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
