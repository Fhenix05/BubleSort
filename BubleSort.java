import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubleSort {

       public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
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
        int[] arr = numbers.stream().mapToInt(i -> i).toArray();
        bubbleSort(arr);
    }
}