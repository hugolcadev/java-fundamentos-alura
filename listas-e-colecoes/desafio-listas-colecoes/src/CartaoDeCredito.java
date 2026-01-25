import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List <Compra> compras = new ArrayList<>();

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public List <Compra> getCompras(){
        return this.compras;
    }

    public void adicionaCompra(Compra compra){
        compras.add(compra);
        this.saldo -= compra.getValor();
    }

    
}
