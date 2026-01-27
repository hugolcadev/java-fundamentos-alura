import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String apiKey = "SUA_API_KEY";
        System.out.println("Digite o nome da criptomoeda que deseja consultar (Exemplo: bitcoin, ethereum, tether): ");
        var cripto = sc.nextLine();
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids="+ cripto +"&x_cg_demo_api_key=" + apiKey))
                .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
