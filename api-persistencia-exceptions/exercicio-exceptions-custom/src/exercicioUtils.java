import excecao.SenhaInvalidaException;

public class exercicioUtils {
    public static void validaSenha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caractéres.");
        }
    }
}
