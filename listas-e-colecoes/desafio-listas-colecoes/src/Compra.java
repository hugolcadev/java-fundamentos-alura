public class Compra implements Comparable <Compra>{
    private double valor;
    private String descricao;

    public Compra(double valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra compra){
        if (this.valor > compra.getValor()){
            return 1;
        } else if (this.valor < compra.getValor()) {
            return -1;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return this.descricao + " - " + this.valor;
    }
}
