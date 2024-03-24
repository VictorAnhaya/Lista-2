import java.util.Scanner;

public class Ex06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int tamanho = 5;
        
        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];
        
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = leitor.nextDouble();
        }
        
        System.out.println("Digite os 5 pesos correspondentes:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Peso " + (i+1) + ": ");
            pesos[i] = leitor.nextDouble();
        }
        
        double somaProdutos = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaProdutos / somaPesos;
        
        System.out.println("Média ponderada do aluno: " + mediaPonderada);
        
        
    }
}
