import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("sol", "sun");
        diccionario.put("teléfono", "phone");
        diccionario.put("amigo", "friend");
        diccionario.put("rojo", "red");
        diccionario.put("playa", "beach");
        diccionario.put("tiempo", "time");
        diccionario.put("coche", "car");
        diccionario.put("jardín", "garden");
        diccionario.put("comida", "food");
        diccionario.put("computadora", "computer");
        diccionario.put("agua", "water");
        diccionario.put("trabajo", "job");
        diccionario.put("aire", "air");
        diccionario.put("música", "music");
        diccionario.put("puerta", "door");
        diccionario.put("naturaleza", "nature");

        Random random = new Random();
        Object[] palabrasEspañol = diccionario.keySet().toArray();
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a realizar una prueba de traducción Español-Inglés.");
        System.out.println("Te mostraré 5 palabras en español y tú debes traducirlas al inglés.");

        for (int i = 0; i < 5; i++) {
            int irandom = random.nextInt(palabrasEspañol.length);
            String palabraEspañol = (String) palabrasEspañol[irandom];
            String traduccionCorrecta = diccionario.get(palabraEspañol);

            System.out.print("Palabra en español: " + palabraEspañol + " - Traducción al inglés: ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        System.out.println("Prueba completada. Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
