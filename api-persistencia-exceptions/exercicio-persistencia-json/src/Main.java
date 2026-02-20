import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("matrix", 60);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        try (FileWriter escrita = new FileWriter("escrita.json")) {
            escrita.write(json);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
