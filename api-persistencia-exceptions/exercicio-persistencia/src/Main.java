import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "Conteudo a ser gravado no arquivo.";
        try (FileWriter escrita = new FileWriter("arquivo.txt")) {
            escrita.write(data);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
