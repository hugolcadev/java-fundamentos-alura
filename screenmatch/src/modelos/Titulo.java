package modelos;
public class Titulo implements Comparable<Titulo> {
    //modificadores de acesso adicionados no módulo 2 do curso
    private String nome;
    private String anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes = 0;
    private int totalAvaliacoes = 0;
    private int duracaoEmMinutos;

    public Titulo(String nome, String anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    
    //métodos getters e setters adicionados no módulo 2 do curso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes(){
        return this.somaDasAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }

    public void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }

}
