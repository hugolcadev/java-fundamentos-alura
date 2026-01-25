public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void fazBarulho(){
        System.out.println("Au au au!");
    }
}
