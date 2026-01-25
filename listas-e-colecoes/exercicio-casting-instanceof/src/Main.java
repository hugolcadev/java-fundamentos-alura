public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tulipa", 2);
        Animal animal = (Animal) cachorro;
        System.out.println(animal);

        Animal bicho = new Gato("Tirolesa", 4);
        if (bicho instanceof Gato){
            Gato gato = (Gato) bicho;
            System.out.println(gato);
        } else {
            System.out.println("O objeto não é um gato.");
        }

    }
}
