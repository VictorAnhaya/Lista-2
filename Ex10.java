import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }
        
        System.out.println("Vetor B (elementos de A invertidos):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorB[i] + " ");
        }
        System.out.println(); 
        
    }
}

