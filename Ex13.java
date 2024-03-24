import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência Fibonacci: ");
        int n = leitor.nextInt();

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Os primeiros " + n + " termos da sequência Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + " ");
        }
        

    }
}


