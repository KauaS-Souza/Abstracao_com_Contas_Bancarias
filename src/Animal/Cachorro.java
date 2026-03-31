package Animal;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        IO.println("Au Au Au!");
    }
}
