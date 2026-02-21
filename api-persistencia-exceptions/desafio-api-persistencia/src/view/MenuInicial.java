package view;

import excecao.CepInvalidoException;
import modelo.Cep;
import service.ApiService;
import service.PersistenciaService;

import java.io.IOException;
import java.util.Scanner;

public class MenuInicial {
    Scanner sc = new Scanner(System.in);

    public void iniciar() throws IOException, InterruptedException{
        while (true) {
            System.out.println("Insira o CEP a ser consultado: ");
            String numero = sc.nextLine();
            try {
                Cep cep = new Cep(numero);
                String json = ApiService.buscaCep(cep.getNumero());
                System.out.println(json);
                PersistenciaService.salvarEndereco(json);
                System.out.println("Dados salvos.");
                break;
            } catch (CepInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
