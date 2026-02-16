import com.google.gson.Gson;
import modelo.Pessoa;
public class Main {
    public static void main(String[] args) {
        String json = """
                {
                   "nome" : "Hugo",
                   "idade" : 24,
                   "cidade" : "Rio de Janeiro"
                }   
                """;
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
