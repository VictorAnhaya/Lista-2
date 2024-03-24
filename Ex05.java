import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os " + tamanho + " números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        System.out.println("Digite um número para contar quantas vezes ele aparece no vetor:");
        int n = leitor.nextInt();
        
        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }
        
        System.out.println("O número " + n + " aparece " + quantidade + " vezes no vetor.");
        
    }
}
