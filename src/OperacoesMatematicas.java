import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realiza as operações
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;

        // Exibe os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        scanner.close();
    }
}
