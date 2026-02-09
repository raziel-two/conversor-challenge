<h1>💱 Conversor de Monedas</h1>

¡Bienvenido al Conversor de Monedas! Este proyecto es una aplicación de consola desarrollada en **Java** que permite realizar conversiones de divisas en tiempo real, consultando datos actualizados a través de una API externa.

Este desafío forma parte del programa **Oracle Next Education (ONE)** y pone en práctica los pilares fundamentales de la programación orientada a objetos y el manejo de servicios HTTP.


## 🚀 Funcionalidades
- **Conversión en tiempo real:** Obtiene tasas de cambio actualizadas directamente desde la API de ExchangeRate-API.
- **Menú Interactivo Extendido:** Interfaz de consola amigable con 12 opciones de conversión que incluyen Argentina, Brasil, Colombia, Venezuela, Perú y México.
- **Soporte de Múltiples Monedas:** Permite conversiones de ida y vuelta para todas las divisas integradas.
- **Estética Mejorada:** Uso de emojis para feedback de usuario y formato de números con separadores de miles y decimales configurados.


## 🛡️ Control de Errores
- **Validación de Entradas:** Implementación de `try-catch` para capturar errores cuando el usuario ingresa letras en lugar de números (`InputMismatchException`).
- **Protección de Bucle:** Limpieza automática del búfer del Scanner para evitar ciclos infinitos tras un error.
- **Validación de Rango:** Filtro lógico que asegura que solo se procesen las opciones disponibles en el menú (1-13).


## 🕹️ ¿Cómo funciona?
1. **Configuración de API Key:** Obtén tu llave en [ExchangeRate-API](https://www.exchangerate-api.com/) y colócala en la variable `apiKey` dentro de la clase `ConexionApi`.
2. **Ejecución:** Inicia la aplicación desde tu IDE o terminal.
3. **Selección de Moneda:** Elige la opción de conversión deseada (1-12) o la opción (13) para salir del programa.
4. **Ingreso de Monto:** Escribe el valor que deseas convertir.
5. **Resultado:** El programa consultará la API y te mostrará el valor final con la tasa actualizada y el código de moneda correspondiente.


## 🧠 Conceptos Aplicados
- **Consumo de API:** Uso de `HttpClient`, `HttpRequest` y `HttpResponse`.
- **Manipulación de JSON:** Conversión de datos externos a objetos Java mediante la librería **Gson**.
- **Modelado de Datos:** Uso de **Records** para una estructura de datos más limpia y eficiente (`RespuestaApi`).
- **Control de Excepciones:** Manejo proactivo de errores de entrada y fallos en la conexión de red.


## 🛠️ Tecnologías usadas
- **Java JDK 21**.
- **Gson (Google)** — Librería para el mapeo de archivos JSON.
- **ExchangeRate-API** — Fuente de datos para las tasas de cambio.


## 👩‍💻 Autor
Challenge de Alura Latam, Creado por **Raziel** 💙


## 📂 Estado del proyecto
✅ **Completado**
