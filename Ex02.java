import java.util.Scanner;
    
public class Ex02{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = leitor.nextInt();
        
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número da posição " + i + ":");
            vetor[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número na posição " + i + " é negativo.");
            } else {
                System.out.println("O número na posição " + i + " é zero.");
            }
        }
        
    }
}

