package modelo;

public class Gato extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Miau miau!");
    }

    public void arranharMóveis(){
        System.out.println("Arranhando móvel!");
    }

}
