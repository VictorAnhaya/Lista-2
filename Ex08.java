import java.util.Scanner;

public class Ex08{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2]; 
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = leitor.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i]; 
            vetorC[i + tamanho] = vetorB[i]; 
        }
        
        System.out.println("Vetor C (concatenação de A e B):");
        for (int i = 0; i < tamanho * 2; i++) {
            System.out.println(vetorC[i] + " ");
        }
        
    }
}
