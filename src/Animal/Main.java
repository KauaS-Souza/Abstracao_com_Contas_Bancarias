package Animal;

public class Main {

    static void main() {


        Animal humano = new Humano();
        humano.setNome("Pablo");
        humano.setIdade("19");
        IO.println("Nome: "+humano.getNome()+" Idade:"+ humano.getIdade());
        humano.som();


        Animal cachorro = new Cachorro();
        cachorro.setNome("Lolo");
        cachorro.setIdade("5");
        IO.println("Nome: "+cachorro.getNome()+ " Idade:"+cachorro.getIdade());
        cachorro.som();

    }
}
