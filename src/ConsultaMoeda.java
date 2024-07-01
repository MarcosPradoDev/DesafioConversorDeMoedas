import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public Conversor valorFinal (String moedaEscolhida, String moedaAConverter, double valorSemConverter){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/ca91b870ca790b73e693b4b8/pair/" + moedaEscolhida + "/" + moedaAConverter + "/" + valorSemConverter);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Deu ruim, não consegui acessar a cotação hoje");
        }

        return new Gson().fromJson(response.body(), Conversor.class);
    }
}






















