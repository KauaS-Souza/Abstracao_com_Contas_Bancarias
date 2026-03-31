package futebolInterface;

import java.util.Date;

public class Jogador extends Clube implements LocalJogo{

    public Jogador(){

    }

    public Jogador(String nome, Date funadacao, double valor) {
        super(nome, funadacao, valor);
    }

    @Override
    public void localjogo() {
        IO.println("R. Prof. Eurico Rabelo - Maracanã, Rio de Janeiro - RJ, 20271-150");
    }
}
