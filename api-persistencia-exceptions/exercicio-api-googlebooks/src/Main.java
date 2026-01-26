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
        System.out.println("Digite o nome do livro: ");
        String busca = sc.nextLine();
        System.out.println("Digite o nome do autor: ");
        String autor = sc.nextLine();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=+intitle:" + busca.replace(" ", "") + "+inauthor:" + autor.replace(" ", "") + "&key=AIzaSyDYSzEIiVWB58b2vx3PL5n9yYok9ZjLVGQ";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        

    }
}
