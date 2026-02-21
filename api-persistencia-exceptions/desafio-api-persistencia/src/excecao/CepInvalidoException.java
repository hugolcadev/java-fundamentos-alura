package excecao;

public class CepInvalidoException extends RuntimeException {
    private String mensagem;
    public CepInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
