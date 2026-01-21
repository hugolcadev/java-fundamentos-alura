package modelos;

public class Filme extends Titulo{
    private String diretor;

    public Filme(String nome, String anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    
}
