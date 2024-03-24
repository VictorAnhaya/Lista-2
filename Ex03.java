import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = leitor.nextInt();
        
        int[] vetor1 = new int[tamanho];
        
        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = leitor.nextInt();
        }
        
        int[] vetor2 = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = vetor1[i] * 2;
        }
        
        System.out.println("Valores do segundo vetor (dobro dos números do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor2[i]);
        }
        
        
    }
}
