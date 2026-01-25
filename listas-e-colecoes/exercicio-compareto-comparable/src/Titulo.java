public class Titulo implements Comparable <Titulo>{
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo tituloComparado) {
        return this.getNome().compareTo(tituloComparado.getNome());
    }

    public String getNome(){
        return this.nome;
    }
}
