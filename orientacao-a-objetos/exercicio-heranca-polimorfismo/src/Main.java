import modelo.Cachorro;
import modelo.Gato;

public class Main {
    public static void main(String[] args) throws Exception {
        Cachorro tigrao = new Cachorro();
        tigrao.setNome("Tigrão");
        tigrao.setIdade(5);

        Gato mimosa = new Gato();
        mimosa.setNome("Mimosa");
        mimosa.setIdade(3);

        tigrao.emitirSom();
        mimosa.arranharMóveis();
    }
}
