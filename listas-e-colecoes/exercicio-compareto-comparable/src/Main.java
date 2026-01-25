import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Titulo> titulos = new ArrayList<>();
        Titulo titulo1 = new Titulo("zebra");
        Titulo titulo2 = new Titulo("jaqueline");
        Titulo titulo3 = new Titulo("abracadabra");         
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        Collections.sort(titulos);
        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());
        }
    }
}
