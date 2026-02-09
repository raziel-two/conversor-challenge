import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		ConexionApi conexion = new ConexionApi();
		ConversorApp menu = new ConversorApp();
		int opcion = 0;

		//emojis para decorar print
		String emoji1 = "\uD83D\uDEAB"; //warning
		String emoji2 =	"(\u2060╥\u2060﹏\u2060╥\u2060)"; //llorando
		String emoji3 =	"(\u2060 \u2060˘\u2060 \u2060³\u2060˘\u2060)\u2060♥"; //beso y corazon

		while (opcion != 13) {
			try{
				menu.exibirMenu(); // llamamos al menu
				opcion = lectura.nextInt();

				if (opcion == 13) {
					System.out.println("Finalizando el programa. ¡Gracias por usar el conversor!" + emoji3);
					break;
				}

				//si el usuario ingresa un numero que no esta en el menu
				if (opcion < 1 || opcion > 12) {
					System.out.println("***************************************************");
					System.out.println("Opción no válida. Por favor, elige una opcion del menu." + emoji2);
					continue; // Salta directamente al inicio del while sin pedir el monto
				}

				System.out.println("Ingresa el valor que deseas convertir:");
				double monto = lectura.nextDouble();

				String base = "", destino = "";

				// filtrar monedas segun la opción
				switch (opcion) {
					case 1 -> { base = "USD"; destino = "ARS"; } // Dólar a Peso Argentino
					case 2 -> { base = "ARS"; destino = "USD"; } // Peso Argentino a Dólar
					case 3 -> { base = "USD"; destino = "BRL"; } // Dólar a Real Brasileño
					case 4 -> { base = "BRL"; destino = "USD"; } // Real Brasileño a Dólar
					case 5 -> { base = "USD"; destino = "COP"; } // Dólar a Peso Colombiano
					case 6 -> { base = "COP"; destino = "USD"; } // Peso Colombiano a Dólar
					case 7 -> { base = "USD"; destino = "VES"; } // Dólar a Bolívar
					case 8 -> { base = "VES"; destino = "USD"; } // Bolívar a Dólar
					case 9 -> { base = "USD"; destino = "PEN"; } // Dólar a Sol
					case 10 -> { base = "PEN"; destino = "USD"; } // Sol a Dólar
					case 11 -> { base = "USD"; destino = "MXN"; } // Dólar a Peso Mex
					case 12 -> { base = "MXN"; destino = "USD"; } // Peso Mex a Dólar
					default -> System.out.println("Opción no válida. Intente de nuevo.");
				}

				if (!base.isEmpty()) {
					String json = conexion.obtenerDatos(base, destino);
					menu.calcularConversion(json, monto);
				}
			}catch (InputMismatchException e){
				System.out.println("***************************************************");
				System.out.println("¡Debes ingresar un numero valido, no letras!" + emoji1);
				lectura.nextLine(); //evita bucle infinito
			}

		}
	}
}
