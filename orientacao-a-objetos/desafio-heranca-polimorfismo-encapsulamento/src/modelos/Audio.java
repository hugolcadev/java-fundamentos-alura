package modelos;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalReproducoes = 0;
    private int curtidas = 0;
    private int classificacao;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void reproduz(){
        System.out.println("Reproduzindo " + titulo);
        totalReproducoes++;
    }

    public void curte(){
        System.out.println(titulo + "curtido!");
        curtidas++;
    }

    
    

}
