import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }
        
        int maiorElemento = vetor[indiceMaior];
        for (int i = indiceMaior; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanho - 1] = maiorElemento;
        
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}

