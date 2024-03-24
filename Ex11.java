import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = leitor.nextInt();
        }
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = leitor.nextInt();
        }
        
        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        System.out.println("Produto escalar: " + produtoEscalar);
        
    }
}


