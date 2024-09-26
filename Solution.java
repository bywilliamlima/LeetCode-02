import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public int distributeCandies(int[] tiposDoces) {
        int n = tiposDoces.length;
        HashSet<Integer> tiposUnicos = new HashSet<>();

        for (int tipo : tiposDoces) {
            tiposUnicos.add(tipo);
        }

        int maxDoces = n / 2;

        return Math.min(tiposUnicos.size(), maxDoces);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a entrada no formato 'tiposDoces = 1,1,2,2,3,3': ");
        String entrada = scanner.nextLine(); 
        
        String numeros = entrada.replaceAll(".*\\[(.*)\\].*", "$1"); 
        String[] stringsNumeros = numeros.split(",");

        int[] tiposDoces = new int[stringsNumeros.length];
        for (int i = 0; i < stringsNumeros.length; i++) {
            tiposDoces[i] = Integer.parseInt(stringsNumeros[i].trim()); 
        }

        Solution solucao = new Solution();
        
        System.out.println( solucao.distributeCandies(tiposDoces));

        scanner.close(); 
    }
}