package service;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaService {
    public static void salvarEndereco(String json) throws IOException {
        try (FileWriter writer = new FileWriter("endereco.json")) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
