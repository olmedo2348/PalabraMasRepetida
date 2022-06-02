import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("resources/archivo.csv"));
        Map<String, Integer> listaPalabraValor = new HashMap<String, Integer>();
        while (sc.hasNextLine()) {
            String[] palabra = sc.nextLine().split(",");
            for (String palabras : palabra) {
                if (listaPalabraValor.containsKey(palabras)) {
                    listaPalabraValor.put(palabras, listaPalabraValor.get(palabras) + 1);
                } else {
                    listaPalabraValor.put(palabras, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : listaPalabraValor.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
