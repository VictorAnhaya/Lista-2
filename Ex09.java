import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = leitor.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) { 
                vetorC[i] = vetorA[i];
            } else { 
                vetorC[i] = vetorB[i];
            }
        }
        
        System.out.println("Vetor C gerado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorC[i] + " ");
        }
        System.out.println(); 
        
        
    }
}
