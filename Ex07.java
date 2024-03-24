import java.util.Scanner;

public class Ex07 {
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
        
        boolean saoIguais = true;
        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }
        
        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
        
    }
}
