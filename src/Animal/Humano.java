package Animal;

public class Humano extends Animal{

    public Humano() {
    }

    public Humano(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        IO.println("Haaaaaaaaaaaaaaa!");
    }
}
