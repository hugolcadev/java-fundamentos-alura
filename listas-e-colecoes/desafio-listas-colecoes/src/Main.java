import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Digite o limite do cartão: ");
        double limite = Double.parseDouble(sc.nextLine());
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        do {
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.nextLine();
            System.out.println("Digite o valor da compra: ");
            Double valor = Double.parseDouble(sc.nextLine());
            if (valor <= cartao.getSaldo()){
                Compra compra = new Compra(valor, descricao);
                cartao.adicionaCompra(compra);
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }
            System.out.println("Digite 0 para sair ou 1 para continuar");
            op = Integer.parseInt(sc.nextLine());
        } while (op != 0);
        Collections.sort(cartao.getCompras());
        System.out.println("*********************");
        System.out.println("COMPRAS REALIZADAS\n");
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra);
        }
        System.out.println("\n*********************\n");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
        sc.close();
    }
}
