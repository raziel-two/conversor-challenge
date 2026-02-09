import com.google.gson.annotations.SerializedName;

public record RespuestaApi(String base_code,
						   String target_code,
						   double conversion_rate) {
}

//String base_code es nuestra moneda base
//String target_code es nuestra moneda destino
//double conversion_rate es nuetra tasa de conversion