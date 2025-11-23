import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la ruta del archivo de números: ");
        String inputPath = scanner.nextLine(); // El usuario ingresa la ruta
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] nums = line.split(",");
                for (String num : nums) {
                    numbers.add(Integer.parseInt(num.trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
    }
}