import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int soma = 0;
        
        System.out.println("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        
        double media = (double) soma / 5;
        
        System.out.println("A média é: " + media);
        System.out.println("Valores menores que a média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Valores iguais à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == media) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Valores superiores à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
        
    }
}

