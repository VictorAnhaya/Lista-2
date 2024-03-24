import java.util.Scanner;

public class Ex12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 12;
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        int produto = 1;
        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }
        
        System.out.println("Produto dos elementos pares positivos: " + produto);
        
    }
}

