import java.util.Scanner;

public class CalculoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double valorTotal = precoLitro * litrosVendidos;

        System.out.printf("O cliente deve pagar: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
