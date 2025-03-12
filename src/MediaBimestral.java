import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            soma += scanner.nextDouble();
        }

        double media = soma / 4;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
