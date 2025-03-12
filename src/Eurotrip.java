import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();

        System.out.print("Digite o valor da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();

        System.out.print("Digite o valor da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();

        System.out.print("Digite o número de pessoas que irão viajar: ");
        int quantidadePessoas = scanner.nextInt();

        double valorTotal = (precoAlemanha + precoPortugal + precoItalia) * quantidadePessoas;

        System.out.println("O valor total da viagem para todas as pessoas é: " + valorTotal);

        scanner.close();
    }
}
