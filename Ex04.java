import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os " + tamanho + " números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        System.out.println("Digite um número para comparar:");
        int n = leitor.nextInt();
        
        System.out.println("Índices dos elementos que são inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }
        
    }
}
