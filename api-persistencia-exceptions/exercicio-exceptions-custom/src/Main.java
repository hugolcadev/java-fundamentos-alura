import excecao.SenhaInvalidaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = sc.nextLine();

        try {
            exercicioUtils.validaSenha(senha);
            System.out.println("Sucesso!");
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
