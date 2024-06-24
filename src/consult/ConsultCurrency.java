package consult;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import model.Currency;
public class ConsultCurrency {
    String apiKey = "YOUR API KEY HERE";

    public Currency searchCurrency (String baseCode, String targetCode, double amount){

        URI address = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + targetCode + "/" + amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
    try {
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Currency.class);
    }catch (Exception e) {
        throw new RuntimeException("Currency is not valid");
    }

    }


}
