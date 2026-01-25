import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <String> lista = new ArrayList<>(); 
        lista.add("Teste1");
        lista.add("Alface");
        lista.add("Teste2");
        lista.add("Tetris");
        for (String string : lista) {
            System.out.println(string);
        }       
    }
}
