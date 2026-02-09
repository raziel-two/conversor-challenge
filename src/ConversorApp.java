import com.google.gson.Gson;

public class ConversorApp {
	// metodo para mostrar el menú
	public void exibirMenu() {
		System.out.println("""
                ******************************************************************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Dólar =>> Bolívar Venezolano
                8) Bolívar Venezolano =>> Dólar
                9) Dólar =>> Sol Peruano
                10) Sol Peruano =>> Dólar
                11) Dólar =>> Peso Mexicano
                12) Peso Mexicano =>> Dólar
                13) Salir
                
                Elija una opción válida:
                ******************************************************************
                """);
	}

	//conversión
	public void calcularConversion(String json, double monto) {
		Gson gson = new Gson();
		RespuestaApi tasaDeCambio = gson.fromJson(json, RespuestaApi.class);

		double resultado = monto * tasaDeCambio.conversion_rate();

		System.out.printf("El valor %,.2f [%s] corresponde al valor final de >>> %,.2f [%s]%n",
				monto, tasaDeCambio.base_code(), resultado, tasaDeCambio.target_code());
	}
}










