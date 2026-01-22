package modelos;

public class Musica extends Audio {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getClassificacao(){

        if (this.getCurtidas() >= this.getTotalReproducoes() * 0.5) {
            return 10;
        } else if (this.getCurtidas() >= this.getTotalReproducoes() * 0.4){
            return 8;
        } else if (this.getCurtidas() >= this.getTotalReproducoes() * 0.3){
            return 6;
        } else if (this.getCurtidas() >= this.getTotalReproducoes() * 0.2){
            return 4;
        } else {
            return 2;
        }
    }
    
}
