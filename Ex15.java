import java.util.Scanner;

public class Ex15{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        int[] vetor = new int[tamanho];
        
        System.out.print("Digite o primeiro número: ");
        vetor[0] = leitor.nextInt();
        
        for (int i = 1; i < tamanho; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = leitor.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido! O número digitado deve ser maior que o anterior.");
                i--; 
            }
        }
        
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i] + " ");
        }
        
    }
}
