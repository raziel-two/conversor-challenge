import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {
	//metodo
	public String obtenerDatos(String base_code, String targetcode){
		//crear nuestra propia URL
		//crear nuestra propia API
		String apiKey = "TU_API_KEY_AQUÍ"; //aca colocas tu propia Api Key
		URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base_code + "/" + targetcode);

		//HttpClient y el HttpRequest
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(direccion)
				.build();
		//HttpResponse
		//en vez de hacer el throw arriba para el send
		// se hace aca el try catch con el send
		try {
			HttpResponse<String> response = client
					.send(request, HttpResponse.BodyHandlers.ofString());
			//retorna el texto puro
			return response.body();
		} catch (IOException | InterruptedException e) {
			throw new RuntimeException("No se pudo realizar la conexión con la API.");
		}

	}
}
