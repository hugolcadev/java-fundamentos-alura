public class Filme {
    String nome;
    String anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes = 0;
    int totalAvaliacoes = 0;
    int duracaoEmMinutos;

    public Filme(String nome, String anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }

    void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }

}
