public class Main {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme("Django Livre", "2013", true, 165);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
